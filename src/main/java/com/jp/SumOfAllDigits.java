package com.jp;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigits {
	
	public static void main(String[] args) {
		int i = 15623;
		
		Integer sum = Stream.of(String.valueOf(i).split(""))
				.collect(Collectors.summingInt(Integer::valueOf));
		System.out.println(sum);
	}

}
