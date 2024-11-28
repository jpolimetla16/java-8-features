package com.jp.medium;

import java.util.Arrays;
import java.util.stream.Stream;

public class FibSeries {
	
	public static void main(String[] args) {
		Integer[] arr = Stream.iterate(new int[] {0,1}, f->new int[] {f[1],f[0]+f[1]})
			.limit(10)
			.map(f->f[0])
			.toArray(Integer[]::new);
		System.out.println(Arrays.toString(arr));
	}

}
