package com.jp.medium;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Palindrome {
	
	public static void main(String[] args) {
		String str="deed";
		
		boolean checkIfPalindrome = IntStream.range(0, str.length()/2)
				.noneMatch(i->str.charAt(i)!=str.charAt(str.length()-1-i));
		
		System.out.println(checkIfPalindrome);
		
	}

}
