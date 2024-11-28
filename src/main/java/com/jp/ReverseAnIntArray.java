package com.jp;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseAnIntArray {
	
	public static void main(String[] args) {
		int[] array = new int[] {5, 1, 7, 3, 9, 6};
		int[] array2 = IntStream.rangeClosed(1,array.length)
				.peek(System.out::println)
				.map(i->array[array.length-i])
			.toArray();
		System.out.println(Arrays.toString(array2));
	}

}
