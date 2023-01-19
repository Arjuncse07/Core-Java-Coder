package com.arjun.Thread;
//start vs run()
 class ThreadA implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}
 public class ThreadDemo3 {
	 public static void main(String[] args) {
		 ThreadA a=  new ThreadA();
				
	}
 }
