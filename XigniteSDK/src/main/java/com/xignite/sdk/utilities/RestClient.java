package com.xignite.sdk.utilities;

import com.xignite.sdk.api.ApiBase;
import com.xignite.sdk.exceptions.XigniteApiException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class RestClient {
	static String version;

	public RestClient(ApiBase apiBase) {
		version = apiBase.getSdkVersion();
	}

	public static String get(String url, LinkedHashMap<String, String> params) throws XigniteApiException {
		return get(url, params, true);
	}

	public static String get(String url, LinkedHashMap<String, String> params, boolean useHttps) throws XigniteApiException {
		HttpURLConnection urlConnection = null;
		InputStreamReader isr = null;
		if (useHttps) {
			url = url.replaceFirst("^http://", "https://");
		} else {
			url = url.replaceFirst("^https://", "http://");
		}

		try {
			url = createUrlWithQuerystring(url, params);
			URL endpoint = new URL(url);
			urlConnection = (HttpURLConnection)endpoint.openConnection();
			isr = new InputStreamReader(urlConnection.getInputStream());
			BufferedReader rd = new BufferedReader(isr);
			StringBuilder builder = new StringBuilder();
			String line = "";

			while((line = rd.readLine()) != null) {
				builder.append(line);
			}

			String var9 = builder.toString();
			return var9;
		} catch (Exception var13) {
			throw new XigniteApiException(var13.getMessage() + " => " + url);
		} finally {
			urlConnection.disconnect();
		}
	}

	static String createUrlWithQuerystring(String endpointUrl, LinkedHashMap<String, String> queryParams) throws UnsupportedEncodingException {
		queryParams.put("_sdk.version", version);
		boolean isFirst = true;
		StringBuilder sb = new StringBuilder(endpointUrl);
		Iterator i$ = queryParams.keySet().iterator();

		while(i$.hasNext()) {
			String key = (String)i$.next();
			if (isFirst) {
				sb.append("?");
				isFirst = false;
			} else {
				sb.append("&");
			}

			sb.append(URLEncoder.encode(key, "UTF-8"));
			sb.append("=");
			sb.append(URLEncoder.encode((String)queryParams.get(key), "UTF-8"));
		}

		return sb.toString();
	}

	/*static {
		try {
			Package aPackage = RestClient.class.getPackage();
			version = String.format("JavaSdk:%1$s", aPackage.getImplementationVersion().replace("\r", "").replace("\n", ""));
		} catch (Exception var1) {
			version = "UNKNOWN";
		}

	}*/
}