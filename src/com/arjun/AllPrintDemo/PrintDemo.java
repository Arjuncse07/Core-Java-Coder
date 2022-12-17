package com.arjun.AllPrintDemo;

public class PrintDemo {
public static void main(String[] args) {
	int a=20;
	int b=30;
	System.out.println(a);
	System.out.println(b);
	
	System.out.print(a);
	System.out.print(b);
	
	
	
	
	for(int i=0; i<=127; i++) {
		System.out.printf("%d: %c",i,i);
	}
}
}
