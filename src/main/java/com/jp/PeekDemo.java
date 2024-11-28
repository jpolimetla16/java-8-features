package com.jp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekDemo {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		list.stream()
				.peek(n->System.out.println("Processing :"+n))
				.filter(e->e%2==0)
				.peek(n->System.out.println("Even :"+n))
				.collect(Collectors.toList());
				
	}

}
