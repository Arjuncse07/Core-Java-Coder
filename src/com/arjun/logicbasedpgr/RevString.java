package com.arjun.logicbasedpgr;

public class RevString {
	//reverse a string using recursion
	//charAt method print the character at the specified index
	public static void main(String[] args) {
		 
		String s="Arjun";
		int len=s.length();
		String rev="";
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
	}

}
