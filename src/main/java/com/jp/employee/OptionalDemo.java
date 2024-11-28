package com.jp.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", null, "banana", null, "orange");
		list.stream()
				.map(e->Optional.ofNullable(e))
				.filter(e->e.isPresent())
				.map(e->e.get())
				.forEach(System.out::println);
	}

}
