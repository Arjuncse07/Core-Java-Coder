package com.arjun.java8.DefaulMethods;
//Static method inside interface
interface Interf12{
	public static void m1() {
		System.out.println("Interface static method");
	}
}
public class Test2 {
public static void main(String[] args) {
	
	Test2 t= new Test2();
	//Invoking Interface static method
	Interf12.m1(); //calling static method using Interface name
	
}
}
