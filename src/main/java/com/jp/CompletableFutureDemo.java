package com.jp;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		CompletableFuture<Integer> supplyAsync = CompletableFuture.supplyAsync(()-> {
			String name = Thread.currentThread().getName();
			System.out.println(name);
			return list.stream().reduce(1,(a,b)->a*b);
		});
		supplyAsync.thenAccept(System.out::println);
		
		System.out.println("Hello Janardhan");
		String name = Thread.currentThread().getName();
		System.out.println(name);
	}

}
