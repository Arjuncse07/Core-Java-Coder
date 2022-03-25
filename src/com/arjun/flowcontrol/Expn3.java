package com.arjun.flowcontrol;

public class Expn3 {
	
	static int dividedbyZero(int a, int b)
	{
		int i=a/b;
		return i;
	}
	
	static int computeDivision(int a, int b)
	{
		int res=0;
		try
		{
			
			res=dividedbyZero(a,b);
		}catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException is recorded");
		}
		return res;
	}
	public static void  main(String[] args)
	{
		int a=1;
		int b=0;
		try
		{
			int i= computeDivision(a,b);
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
