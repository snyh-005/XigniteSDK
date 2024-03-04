package com.xignite.sdk.exceptions;

/**
 * @author Saniah Mathews <saniah@balance.me>
 * @date 04/03/2024
 */
public class XigniteApiException extends Exception {
		public XigniteApiException(String message) {
			super("An error occurred while calling the API: " + message);
		}
}
