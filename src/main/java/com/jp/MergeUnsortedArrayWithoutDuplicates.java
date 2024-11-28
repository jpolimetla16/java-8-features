package com.jp;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeUnsortedArrayWithoutDuplicates {
	
	public static void main(String[] args) {
		int[] a = new int[] {4, 2, 5, 1};
		int[] b = new int[] {8, 1, 9, 5};
		
		IntStream.concat(Arrays.stream(a),Arrays.stream(b))
				.sorted().distinct().forEach(System.out::println);
		
		
		
	}

}
