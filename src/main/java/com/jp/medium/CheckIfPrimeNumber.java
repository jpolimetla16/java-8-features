package com.jp.medium;

import java.util.Arrays;
import java.util.List;

import org.springframework.util.FileSystemUtils;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class CheckIfPrimeNumber {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
		
		boolean containsPrime = list.stream()
				.anyMatch(CheckIfPrimeNumber::IfPrime);
		System.out.println(containsPrime);
		
	}

	private static boolean IfPrime(Integer n) {
		
		if(n<=1) {
			return false;
		}
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}

}
