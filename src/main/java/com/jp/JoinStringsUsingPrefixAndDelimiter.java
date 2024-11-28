package com.jp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsUsingPrefixAndDelimiter {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		String str = list.stream()
				.collect(Collectors.joining(",", "[", "]"));
		System.out.println(str);		
		
	}

}
