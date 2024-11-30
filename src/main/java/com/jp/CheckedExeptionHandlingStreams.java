package com.jp;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CheckedExeptionHandlingStreams {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.stream()
				.forEach(wrapper(i->writeToFile(i),IOException.class));
	}


	private static <T,E extends Exception> Consumer<T> wrapper(ThrowingConsumer<T,Exception> throwingConsumer,Class<E> clazz) {
		return i->{
			try {
				throwingConsumer.accept(i);
			}catch(Exception exe) {
				E ex = clazz.cast(exe);
				throw new RuntimeException(ex.getMessage());
			}
		};
	}

	
	public static void writeToFile(Integer i) throws IOException {
		System.out.println(i);
	}

}
