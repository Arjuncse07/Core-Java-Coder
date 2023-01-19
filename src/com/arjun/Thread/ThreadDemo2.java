package com.arjun.Thread;

public class ThreadDemo2 extends Thread{

	@Override
	public void run() {
	    for(int i=1; i<=10; i++) {
	    	System.out.println(i*5);
	    	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
		
	}
	public static void main(String[] args) {
		ThreadDemo2 demo2= new ThreadDemo2();
		demo2.start();
	}

}
