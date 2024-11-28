package com.jp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortBasedOnStringLength {
	
	public static void main(String[] args) {
		 List<String> list = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		 list.stream()
		 		.collect(Collectors.toMap(Function.identity(), e->e.length()))
		 		.entrySet()
		 			.stream()
		 				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		 				.forEach(System.out::println);
	}

}
