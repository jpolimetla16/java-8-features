package com.jp;

import java.util.Arrays;
import java.util.List;

public class LimitAndSkipDemo {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.stream()
				.limit(2)
				.skip(1)
				.forEach(System.out::println);
	}

}
