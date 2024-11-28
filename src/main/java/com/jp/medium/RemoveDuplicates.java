package com.jp.medium;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
		list.stream()
				.distinct().forEach(System.out::println);
		
		
	}

}
