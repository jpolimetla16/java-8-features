package com.jp;

import java.util.Arrays;
import java.util.List;

public class LengthOfStrings {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Python", "JavaScript");
		list.stream()	
				.map(String::length)
				.forEach(System.out::println);
		
	}

}
