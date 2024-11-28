package com.jp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedOrderInAlphabet {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Charlie", "Alice", "Bob");
		list.stream()
				.sorted(Comparator.naturalOrder())
				.forEach(System.out::println);
		
	}

}
