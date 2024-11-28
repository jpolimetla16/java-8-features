package com.jp;

import java.util.stream.IntStream;

public class FirstTenEvenNumbers {
	
	public static void main(String[] args) {
		
		//IntStream.rangeClosed(1, 10).map(e->e*2).forEach(System.out::println);
		
		IntStream.iterate(1, x->2*x).limit(10).forEach(System.out::println);
		
	}

}
