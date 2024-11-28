package com.jp.medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PartitionByUseList {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		list.stream()
				.collect(Collectors.partitioningBy(e->e%2==0))
				.entrySet().stream().forEach(System.out::println);
		
		
		
	}

}
