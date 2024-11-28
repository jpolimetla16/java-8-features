package com.jp;

import java.util.Arrays;

public class SumAndAverage {
	
	public static void main(String[] args) {
		int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
		Arrays.stream(a).sum();
		Arrays.stream(a).average().getAsDouble();
	}

}
