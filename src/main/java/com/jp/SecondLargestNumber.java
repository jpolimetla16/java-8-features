package com.jp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {
	
	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		 list.stream()
		 		.sorted(Comparator.reverseOrder())
		 		.limit(2).skip(1).findFirst().ifPresent(System.out::println);
	}

}
