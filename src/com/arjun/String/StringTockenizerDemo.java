package com.arjun.String;

import java.util.StringTokenizer;
//StringTockenizer will break string into Token
public class StringTockenizerDemo {
public static void main(String[] args) {
	StringTokenizer stringTokenizer= new StringTokenizer("Amit is good boy");
	StringTokenizer stringTokenizer1= new StringTokenizer("Amit,is,good,boy");

		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());	
		}
	System.out.println("--------------------------------------------------------------");
	System.out.println("Next Tocken is:"+stringTokenizer1.nextToken(","));
}
}
