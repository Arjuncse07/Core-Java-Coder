package com.arjun.StaticNonstatic;
/**
 * Static Control Flow
 * 
 * 
 * @author aj629
 *
 */

class Base{
	static int i=10;
	static {
		m1();
		System.out.println("under static block");
	}
	public static void main(String[] args) {
		m1();
		System.out.println("Under base main");
	}
	public static void m1() {
		System.out.println(j);
	}
	static int j=20;
}
public class StaticControlFlow extends Base {
static int x=100;
static {
	m2();
	System.out.println("Under derived static block");
}
public static void main(String[] args) {
	m2();
	System.out.println("Under derived main method");
}
public static void m2() {
	System.out.println(y);
}
static {
	System.out.println("Derived second static block");	
}
static int y=200;
}
