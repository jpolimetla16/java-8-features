package com.jp.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DupliacateElementsInList {
	
	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		 
		list.stream()
				.filter(e->Collections.frequency(list, e)>1).forEach(System.out::println);
		 
	}

}
