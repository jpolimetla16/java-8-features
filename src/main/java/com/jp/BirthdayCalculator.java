package com.jp;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BirthdayCalculator {
	
	public static void main(String[] args) {
		LocalDate birthDate = LocalDate.of(1984, 01, 16);
		long years = ChronoUnit.YEARS.between(birthDate, LocalDate.now());
		System.out.println(years);
	}

}
