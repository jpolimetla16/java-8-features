package com.jp.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortArray {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Optional.ofNullable(list).orElseGet(Collections::emptyList)
				.stream();
				
	}

}
