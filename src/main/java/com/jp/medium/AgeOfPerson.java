package com.jp.medium;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class AgeOfPerson {
	
	public static void main(String[] args) {
		LocalDate birthDate = LocalDate.of(1984, 8, 6);
		Period period = Period.between(birthDate,LocalDate.now());
		System.out.println(period.getYears());
	}

}
