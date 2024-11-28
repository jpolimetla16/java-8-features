package com.jp.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AnyMatch {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		boolean test = list.stream()
				.anyMatch(e->Collections.frequency(list, e)>1?true:false);
		System.out.println(test);
		
	}

}
