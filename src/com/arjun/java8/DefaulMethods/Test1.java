package com.arjun.java8.DefaulMethods;


interface Right{
	default void m1() {
		System.out.println("Right Method");
	}
}
interface Left{
	default void m1() {
		System.out.println("Left Method");
	}
}


public class Test1 implements Left,Right {
	public void m1() {
		//System.out.println("My own Implementation");
		
		Right.super.m1(); //default method invoke
		Left.super.m1();  //default method invoke
	}
public static void main(String[] args) {
	Test1 t= new Test1();
	t.m1();
}
}
