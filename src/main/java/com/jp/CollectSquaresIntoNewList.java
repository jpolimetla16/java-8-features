package com.jp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectSquaresIntoNewList {
	
	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(1, 2, 3);
		 List<Integer> newList = list.stream()
		 	.map(e->e*e)
		 	.collect(Collectors.toList());	
		 System.out.println(newList);
		 
	}

}
