package com.jp.medium;

import java.util.Arrays;

public class KthElementInAnArray {
	
	public static void main(String[] args) {
		//3 rd smallest element.
		int[] arr = {4, 2, 7, 1, 5, 3, 6};
		Arrays.stream(arr).sorted()
				.skip(2)
				.findFirst().ifPresent(System.out::println);
	}

}
