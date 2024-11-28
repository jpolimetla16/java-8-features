package com.jp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeMaxAndThreeMin {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		list.stream()
				.sorted().limit(3).forEach(System.out::println);
		System.out.println("------");
		list.stream()
				.sorted(Comparator.reverseOrder()).limit(3)
				.forEach(System.out::println);
		
	
		
	}

}
