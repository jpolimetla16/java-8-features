package com.jp.medium;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
	
	public static void main(String[] args) {
		String input = "Java articles are Awesome";
		String str = input.replaceAll(" ", "").toLowerCase();
		Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),
						LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue()==1)
				.findFirst().ifPresent(System.out::println);
	}

}
