package com.arjun.java8.LambdaExp;

public class Test5 {
	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Lambda Child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Lambda Main Thread");
		}

	}

}
