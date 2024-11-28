package com.jp.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Anagram {
	
	public static void main(String[] args) {
		String str = "a gentleman";
		String mstr = str.replaceAll(" ", "").toLowerCase();
		Arrays.sort(mstr.getBytes());
		String result = Arrays.stream(mstr.split(""))
				.sorted(Comparator.naturalOrder()).collect(Collectors.joining());
		System.out.println(result);
		
	}
	

}
