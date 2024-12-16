package com.jp;

public class OddAndEvenJ7 {
	
	 int count=1;

	public static void main(String[] args) {

		PrintOddAndEven print = new PrintOddAndEven();

		Thread t1 = new Thread(() -> {
			print.printEvenNumber();
		});

		t1.setName("even");

		Thread t2 = new Thread(() -> {
			print.printOddNumber();
		});

		t2.setName("odd");
		
		t1.start();
		t2.start();

	}

}

class PrintOddAndEven {

	static int count = 1;

	public void printOddNumber() {
		synchronized (this) {
			while (count < 10) {
				if (count%2== 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("count:" + count);
				count++;
				notify();
			}
		}
	}

	public void printEvenNumber() {
		synchronized (this) {
			while (count <= 10) {
				if (count % 2 == 1) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("count:" + count);
				count++;
				notifyAll();
			}
		}
	}

}