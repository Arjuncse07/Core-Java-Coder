package com.arjun.java8.DefaulMethods;
/*Default Methods Inside Interface
 *
 */

interface Interface1{
	default void m1() {
		System.out.println("default method");
	}
}
 class Test implements Interface1{
	 //Overrinding
	 public void m1() {
			System.out.println("My own Implementation");
		} 
	 
public static void main(String[] args) {
	Test t1234= new Test();
	t1234.m1();
}
}
