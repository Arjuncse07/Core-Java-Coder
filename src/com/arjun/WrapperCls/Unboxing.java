package com.arjun.WrapperCls;

public class Unboxing {
	public static void main(String[] args) {
		//Converting Wrapper to Primitives
		
		//Converting Integer to int 
		Integer a =new Integer(3);
		int i=a.intValue(); //converting Integer to int explicitly
		//Unboxing, now compiler will write s.intValue()internally
		int j=a;
		System.out.println(a+" "+i+" "+j);
		//OP:3 3 3
	}

}
