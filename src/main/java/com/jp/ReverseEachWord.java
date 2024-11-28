package com.jp;

import java.util.Arrays;

public class ReverseEachWord {
	
	public static void main(String[] args) {
		String str = "Java Concept Of The Day";
		str.split("");
		Arrays.stream(str.split(" "))
				.map(word->new StringBuffer(word).reverse())
				.forEach(System.out::println);
	}

}
