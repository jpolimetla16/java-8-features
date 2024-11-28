package com.jp;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {
	
	public static void main(String[] args) {
		String input = "Java Concept Of The Day";
		Map<Character, Long> map = input.chars()
				.mapToObj(e->(char)e)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(map);
		
	}

}
