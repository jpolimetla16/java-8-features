package com.jp.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class EvenAndOddUsing7 {

	public static void main(String[] args) {

		Object lock = new Object();

		Runnable even = new EvenAndOdd(lock);
		Runnable odd = new EvenAndOdd(lock);
		Thread t1 = new Thread(even, "even");
		Thread t2 = new Thread(odd, "odd");
		t1.start();
		t2.start();
	}

}

class EvenAndOdd implements Runnable {
	static int count=1;
	private Object object;

	public EvenAndOdd(Object object) {
		this.object = object;
	}

	@Override
	public void run() {

		while (count<=10) {

			if (count%2 == 0 && Thread.currentThread().getName().equals("even")) {
				synchronized (object) {
					System.out.println("Thread Name:" + Thread.currentThread().getName() + ":" +count);
					count++;
					try {
						object.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} else if (count%2!= 0 && Thread.currentThread().getName().equals("odd")) {
				synchronized (object) {
					System.out.println("Thread Name:" + Thread.currentThread().getName() + ":" +count);
					count++;
					object.notify();
				}
			}
		}
	}

}
