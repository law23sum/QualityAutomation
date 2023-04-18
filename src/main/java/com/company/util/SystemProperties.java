package com.company.util;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;

public class SystemProperties {

	public static void main(String[] args) {
		Properties properties = System.getProperties();
		Iterator<Entry<Object, Object>> iterator = properties.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Object, Object> entry = iterator.next();
			String key = (String) entry.getKey();
			String value = (String) entry.getValue();
//			System.out.println(key + ": " + value);
		}
	}
}