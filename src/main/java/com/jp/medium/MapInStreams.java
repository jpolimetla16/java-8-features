package com.jp.medium;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapInStreams {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Janardhan","Vidhya","Aryan","Tejasri");
		Map<String, Integer> map = list.stream()
				.collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println(map);
		
		System.out.println(ZoneId.systemDefault());
		
		
	}

}
