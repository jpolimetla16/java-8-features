package com.jp;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsExceptionHandlingRuntime {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, null, 4, null);

		list.stream().map(e ->{
			return multiply(e);
		}).filter(Optional::isPresent).map(e->e.get()).map(e->e*e).forEach(System.out::println);

	}

	private static <T> Optional<T> multiply(T  e) {
		try {
			return Optional.of(e);
		} catch (Exception exe) {
			System.out.println(exe.getMessage());
		}
		return Optional.empty();
	}

}
