package com.jp.medium;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Multithreading {
	
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(()->{
			String name = Thread.currentThread().getName();
			System.out.println(name);
		});
		
		System.out.println("End of main");
		
	}

}
