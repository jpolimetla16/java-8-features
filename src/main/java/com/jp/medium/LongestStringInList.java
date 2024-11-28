package com.jp.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestStringInList {
	
	public static void main(String[] args) {
		List<String> list = Arrays
	              .asList("apple", "banana", "cherry", "date", "grapefruit");
		
		
		list.stream()
				.sorted(Comparator.comparing(String::length).reversed()).findFirst()
				 .ifPresent(System.out::println);
		
		
	}

}
