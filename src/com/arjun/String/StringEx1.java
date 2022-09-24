package com.arjun.String;
/*  String Methods
 * 
 */
public class StringEx1 {
public static void main(String[] args) {
	
	String name="Arjun";
	
	boolean result=name.equalsIgnoreCase("arjun");
	System.out.println(result);
	int a=name.length();
	System.out.println(a);
	char result1=name.charAt(0);
	System.out.println(result1);
	
	int result2=name.indexOf("o");
	System.out.println(result2);
	boolean result3=name.isBlank();
	System.out.println(result3);
	boolean return4=name.isEmpty();
	System.out.println(return4);
	
	String name1=name.toUpperCase();
	System.out.println(name1);
	String name2=name.toLowerCase();
	System.out.println(name2);
	
	String result6=name.trim();
	System.out.println(result6);
	String result7=name.replace('r', 'o');
	System.out.println(result7);
	
}
}
