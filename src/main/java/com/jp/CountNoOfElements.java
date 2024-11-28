package com.jp;

import java.util.Arrays;
import java.util.List;

public class CountNoOfElements {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "pear");
		long count = list.stream()
				.count();
		System.out.println(count);
	}

}
