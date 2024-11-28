package com.jp;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactersInString {
	
	public static void main(String[] args) {
		String str = "Java Concept Of The Day";
		String replacedStr = str.replaceAll(" ", "");
		Arrays.stream(replacedStr.split("")).collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting())).entrySet()
				.stream()
				.filter(e->e.getValue()>1).forEach(System.out::println);
		
		
	}

}
