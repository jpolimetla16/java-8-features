package com.jp;

import java.util.stream.IntStream;

public class Palindrome {
	
	public static void main(String[] args) {
		String str = "Janardhan";
		boolean isPalindrome = IntStream.range(0,str.length())
				.allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));
		System.out.println(isPalindrome);
	}

}
