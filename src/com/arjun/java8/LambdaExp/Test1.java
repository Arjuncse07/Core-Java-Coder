package com.arjun.java8.LambdaExp;
//Length of the code will be reduce and readability of the code will be improve.
interface Interf {
	// in interface method is always public void abstract
	//Functional interface always have one abstract method inside the interface.
	//More than one abstract method will void the Funtional Interface
	public void m1();
}

public class Test1 {

	public static void main(String[] args) {

		Interf i = () -> System.out.println("lambda Expression");
		i.m1();

	}
}
