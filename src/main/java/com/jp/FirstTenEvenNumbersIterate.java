package com.jp;

import java.util.stream.Stream;

public class FirstTenEvenNumbersIterate {
	
	public static void main(String[] args) {
		Stream.iterate(new int[] {2,4},f->new int[] {f[1],f[1]+2})
			.limit(10)
			.map(f->f[0])
			.forEach(System.out::println);
	}

}
