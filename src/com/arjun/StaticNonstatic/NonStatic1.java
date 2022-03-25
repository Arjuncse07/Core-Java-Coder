package com.arjun.StaticNonstatic;

public class NonStatic1 {

	public int counter =0;
	public static int staticCounter=0;
	
	public NonStatic1()
	{
		counter++;
		staticCounter++;
	}
	
	public static void main(String[] args)
	{
		NonStatic1 ns= new NonStatic1();
		NonStatic1 ns1= new NonStatic1();
		NonStatic1 ns2= new NonStatic1();
		
		System.out.println("Counter: " +ns.counter);
		System.out.println("staticCounter:" +ns.staticCounter);
	}
}
