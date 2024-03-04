package com.xignite.sdk.api;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Saniah Mathews <saniah@balance.me>
 * @date 04/03/2024
 */
@Data
@ToString
@Component
@ConfigurationProperties(prefix = "xignite")
@Scope("singleton")
public abstract class ApiBase {
	protected String apiToken;
	protected String endPointUrl;
	protected String sdkVersion;

	public ApiBase() {
	}
}
