package com.arjun.StaticNonstatic;

public class Static_Demo1 {
	/*
	 * Static Object we can Define Global:::::::::::::
	 */
	
	static Static_Demo1 st1=null;
	
	static {
		Static_Demo1.st1= new Static_Demo1();
		System.out.println("Access Object Inside Static Block"+":"+Static_Demo1.st1);
		
	}

	public static void main(String[] args) {
		System.out.println("Access Object Inside a Main Method"+":"+Static_Demo1.st1);
	}
}
