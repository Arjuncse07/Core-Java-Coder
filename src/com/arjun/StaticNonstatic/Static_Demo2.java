package com.arjun.StaticNonstatic;
/*
 * 14 apprches to call static data and non-static method
 * NSDM and NSFM can not directly access inside static context.(static method or
 * static block).but vise versa is allowed.
 */
public class Static_Demo2 {
int x=10;
static int y=20;
	
void show() {
	display();
	System.out.println(x);
	System.out.println(y);
	System.out.println("Show");
}

public Static_Demo2() {
	System.out.println(x);
	System.out.println(y);
	show();
	display();
}

static void display() {
	System.out.println("Display");
	System.out.println(y);
	//System.out.println(x); //we can't call non-static dm into static method
}

void hello() {
	display();
	show();
	System.out.println(y);
	display();
}

public static void main(String[] args) {
	System.out.println(new Static_Demo2().x);
	
	Static_Demo2 demo2= new Static_Demo2();
	System.out.println(demo2.x);	
	demo2.show();
	demo2.hello();
	
	System.out.println(new Static_Demo2().y);
	System.out.println(Static_Demo2.y);
	System.out.println(y);
	System.out.println(demo2.y);
	
	new Static_Demo2().display();
	display();
	Static_Demo2.display();
}
}
