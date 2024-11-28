package com.jp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class StreamsExceptionHandling {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,null,4);
		Function<Integer,Optional<Double>> func = e->Optional.of(Math.sqrt(e));
		list.stream()
			.map(e->checkIfException(func,e))
			.filter(Optional::isPresent)
			.map(e->e.get().get())
			.forEach(System.out::println);
		
	}

	private static <T,R> Optional<R> checkIfException(Function<T,R> func, T e) {
		try {
			return Optional.of(func.apply(e));
		}catch(Exception exe) {
			System.out.println("Exception Occured:"+exe.getMessage());
			return Optional.empty();
		}
	}

	

	

	
	

}
