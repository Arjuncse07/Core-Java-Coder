package com.arjun.java8.LambdaExp;

interface Interf1 {
	public void m1(int a, int b);
}

public class Test2 {

	public static void main(String[] args) {
		// We have make a sum of two numbers by using lambda expression.
		Interf1 i1 = (a, b) -> System.out.println("Sum of two number by using Lambda Expression:" + (a + b));
		i1.m1(10, 20);
		i1.m1(100, 500);

	}
}
