package com.jp;

import java.util.Arrays;
import java.util.List;

public class DisplayOddAndEvenNumbers {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		System.out.println("Even Numbers:");
		list.stream()
				.filter(e->e%2==0).forEach(System.out::println);
		
		System.out.println("Odd Numbers:");
		list.stream().filter(e->e%2!=0).forEach(System.out::println);
	}

}
