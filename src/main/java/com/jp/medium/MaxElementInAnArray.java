package com.jp.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxElementInAnArray {
	
	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		  list.stream()
		 		.max(Comparator.naturalOrder()).ifPresent(System.out::println);;
		 
	}

}
