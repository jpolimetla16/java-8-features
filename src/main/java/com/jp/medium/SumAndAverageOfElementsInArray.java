package com.jp.medium;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class SumAndAverageOfElementsInArray {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		IntSummaryStatistics summaryStatistics = Arrays.stream(arr)
				.summaryStatistics();
		System.out.println(summaryStatistics.getAverage());
	}

}
