package com.jp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListOfStringsBasedOnLength {
	
	public static void main(String[] args) {
		 List<String> list = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		 list.stream()
		 		.sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
		 
	}

}
