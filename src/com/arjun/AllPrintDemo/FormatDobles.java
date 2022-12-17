package com.arjun.AllPrintDemo;

public class FormatDobles {
public static void main(String[] args) {
	
	
	System.out.println("i Love "+Math.PI+ " a lot!");
	System.out.printf("I love %f a lot!",Math.PI); //formatter for the print line
	double iLovePie= 999*Math.PI * -1;
	float sum= 88.88f;
	
	System.out.println("");
	System.out.printf("I love %, .3f a lot!",sum);
}
}
