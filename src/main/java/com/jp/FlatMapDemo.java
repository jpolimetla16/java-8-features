package com.jp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {
	
	public static void main(String[] args) {
		List<List<String>> list = Arrays.asList(Arrays.asList("A","B"),Arrays.asList("C","D"));
		list.stream()
				.flatMap(List::stream)
				.forEach(System.out::print);;
	}
	

}
