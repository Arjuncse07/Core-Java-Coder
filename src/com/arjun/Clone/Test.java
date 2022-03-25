package com.arjun.Clone;

public class Test implements Cloneable {
int a=10, b=20;
public static void main(String[] args) throws CloneNotSupportedException {
	Test t= new Test();
	System.out.println(t.a+ "  "+t.b);
	
Test duplicateCopy	=(Test)t.clone();
System.out.println(duplicateCopy.a +" " +duplicateCopy.b);
}
}
