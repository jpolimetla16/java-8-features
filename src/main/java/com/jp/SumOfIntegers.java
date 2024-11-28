package com.jp;

import java.util.Arrays;
import java.util.List;

public class SumOfIntegers {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3);
		int test = list.stream()
				.reduce(0,(a,b)->a+b)
				.intValue();
		System.out.println(test);
				
	}

}
