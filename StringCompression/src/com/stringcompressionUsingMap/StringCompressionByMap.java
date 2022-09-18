package com.stringcompressionUsingMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringCompressionByMap {

	public static void main(String[] args) {

		String s = "aadddfggvvdrrraaadgfffkkgergerrd";
		Map<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) != null) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		// it is use because we want to append the values
		StringBuilder sb = new StringBuilder();
		for (Entry<Character, Integer> entry : map.entrySet()) {
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
		System.out.println(sb.toString());
	}
}
