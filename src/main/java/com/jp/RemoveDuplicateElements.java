package com.jp;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateElements {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		list.stream()
				.distinct().forEach(System.out::println);
	}

}
