package com.jp;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacters {
	
	public static void main(String[] args) {
		String str = "Java Concept Of The Day";
		
		Arrays.stream(str.replaceAll(" ", "").split(""))
				.collect(Collectors.groupingBy(Function.identity(),
						LinkedHashMap::new,Collectors.counting()))
				.entrySet()
				.stream().filter(e->e.getValue()==1)
				.findFirst().ifPresent(System.out::println);
			
	}

}
