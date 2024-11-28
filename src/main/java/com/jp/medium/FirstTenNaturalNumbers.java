package com.jp.medium;

import java.util.stream.IntStream;

public class FirstTenNaturalNumbers {
	
	public static void main(String[] args) {
		int sum = IntStream.rangeClosed(1, 10).sum();
		System.out.println(sum);
	}

}
