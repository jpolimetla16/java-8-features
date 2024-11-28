package com.jp;

import java.util.Arrays;
import java.util.List;

public class LastElementOfArray {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
		list.stream()
			.skip(list.size()-1).findFirst().ifPresent(System.out::println);
	}

}
