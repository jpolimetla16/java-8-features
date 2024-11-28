package com.jp.medium;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntegerArray {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] modArray = IntStream.range(0, arr.length)
				.map(i->arr[arr.length-1-i])
				.toArray();
		
		System.out.println(Arrays.toString(modArray));
	}

}
