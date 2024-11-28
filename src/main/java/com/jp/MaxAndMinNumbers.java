package com.jp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumbers {
	
	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		 list.stream()
		 		.max(Comparator.naturalOrder()).ifPresent(System.out::println);
		 
		 list.stream()
		 	.min(Comparator.naturalOrder()).ifPresent(System.out::println);
		 
	}

}
