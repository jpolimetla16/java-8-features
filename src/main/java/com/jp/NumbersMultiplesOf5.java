package com.jp;

import java.util.Arrays;
import java.util.List;

public class NumbersMultiplesOf5 {
	
	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		 list.stream()
		 		.filter(e->e%5==0).forEach(System.out::println);
	}

}
