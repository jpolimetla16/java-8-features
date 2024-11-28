package com.jp.medium;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEveryWord {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "apple", "cherry", 
                "banana", "apple");
		list.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().forEach(System.out::println);
		
	}

}
