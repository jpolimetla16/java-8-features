package com.jp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintDuplicates {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
		list.stream()
				.filter(e->Collections.frequency(list, e)>1).distinct().forEach(System.out::println);
	}

}
