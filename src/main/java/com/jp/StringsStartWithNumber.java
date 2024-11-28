package com.jp;

import java.util.Arrays;
import java.util.List;

public class StringsStartWithNumber {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
		list.stream()
			.filter(e->Character.isDigit(e.charAt(0))).forEach(System.out::println);
	}

}
