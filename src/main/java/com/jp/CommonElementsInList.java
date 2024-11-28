package com.jp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonElementsInList {
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
		List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
		
		List<Integer> list = Stream.concat(list1.stream(), list2.stream()).sorted().collect(Collectors.toList());
		list.stream().filter(e->Collections.frequency(list, e)>1).distinct().forEach(System.out::println);
		 
	}

}
