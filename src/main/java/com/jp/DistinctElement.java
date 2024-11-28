package com.jp;

import java.util.Arrays;
import java.util.List;

public class DistinctElement {
	
	public static void main(String[] args) {
		  List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4);
		  list.stream()
		  		.distinct().forEach(System.out::println);
		  
	}

}
