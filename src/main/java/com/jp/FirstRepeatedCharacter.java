package com.jp;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {
	
	public static void main(String[] args) {
		String inputString = "Java Concept Of The Day";
		
		Arrays.stream(inputString.replaceAll(" ","").split(""))
				.collect(Collectors.groupingBy(Function.identity(),
						LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue()>1).findFirst()
						.ifPresent(System.out::println);
		
		
	}

}
