package com.jp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupStringsByTheirLength {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "bb", "ccc", "dd");
		Map<Integer, List<String>> map = list.stream()
				.collect(Collectors.groupingBy(e->e.length()));
		
		map.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(System.out::println);
		
		
	}

}
