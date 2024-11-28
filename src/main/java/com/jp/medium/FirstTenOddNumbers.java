package com.jp.medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstTenOddNumbers {

	public static void main(String[] args) {
		Integer[] arr = Stream.iterate(new int[] { 1, 3 }, f -> new int[] { f[1], f[1] + 2 })
				.limit(10)
				.map(f->f[0])
				.toArray(Integer[]::new);
		System.out.println(Arrays.toString(arr));

	}

}
