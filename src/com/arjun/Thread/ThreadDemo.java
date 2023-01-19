package com.arjun.Thread;

public class ThreadDemo implements Runnable{

	@Override
	public void run() {
	    //thread task
		for(int i=1; i<=20; i++) {
			System.out.println("i ="+i);
		}
	}
	
	public static void main(String[] args) {
		ThreadDemo demo= new ThreadDemo();
		
		//start()--> java.lang.Thread
		Thread thread= new Thread(demo);
		thread.start();
		
	}
}
