package com.company.util;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncodeUtility {
	public static String encodeBase64(String input) {
		byte[] bytes        = input.getBytes(StandardCharsets.UTF_8);
		byte[] encodedBytes = Base64.getEncoder().encode(bytes);
		return new String(encodedBytes, StandardCharsets.UTF_8);
	}

	public static String decodeBase64(String input) {
		byte[] bytes        = input.getBytes(StandardCharsets.UTF_8);
		byte[] decodedBytes = Base64.getDecoder().decode(bytes);
		return new String(decodedBytes, StandardCharsets.UTF_8);
	}

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage: java EncoderDecoder <encode|decode> <value>");
			System.exit(1);
		}

		String operation = args[ 0 ];
		String value     = args[ 1 ];
		String result;

		switch (operation) {
			case "encode":
				result = encodeBase64(value);
				break;
			case "decode":
				result = decodeBase64(value);
				break;
			default:
				System.out.println("Invalid operation. Use 'encode' or 'decode'.");
				System.exit(1);
				return;
		}

		System.out.println(result);
	}
}