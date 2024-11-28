package com.jp.medium;

import java.util.Arrays;

public class LastElementOfArray {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int last = Arrays.stream(arr).skip(arr.length-1).findFirst().getAsInt();
		System.out.println(last);
	}

}
