package com.jp;

import java.util.Arrays;
import java.util.List;

public class SortedOrderDemo {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 3, 1, 4, 2);
		list.stream()
			.sorted().findFirst().ifPresent(System.out::println);
	}

}
