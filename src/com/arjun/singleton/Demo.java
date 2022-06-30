package com.arjun.singleton;
/*
 * Singleton class are those classes which are having one object per JVM.
 * Controls the object creation
 * It is usually to control access to the resources, such as databases connection and sockets.
 * This object is sharing among all the class and outside the class 
 * Steps: 1.create static object
 *        2.create private constructor
 *        3.create static getInstance method return type is static object refrence.
 */

class Student{
	
	static Student st= new Student();
	private Student() {
		System.out.println("Constructor will invoke for only one object");
	}
	
	static Student getInstance() {
		return st;	
	}
	
}

public class Demo {
	
public static void main(String[] args) {
	
	Student st1=  Student.getInstance();
	Student st2=Student.getInstance();
	
	System.out.println(st1);
	System.out.println(st2);
}
}
