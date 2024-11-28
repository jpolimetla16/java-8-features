package com.jp;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckIfAnagram {
	
	public static void main(String[] args) {
		String s1 = "RaceCar";
		String s2 = "CarRace";
		
		String str1 = Stream.of(s1.split("")).map(e->e.toUpperCase())
				.sorted().collect(Collectors.joining());
		
		String str2 = Stream.of(s2.split(""))
					.map(String::toUpperCase)
					.sorted().collect(Collectors.joining());
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
	}

}
