package com.arjun.java8.Predicate;

import java.util.function.Predicate;
/*
 * Fetch all name start with k
 * using Predicate we can define
 */
public class Demo_Predicate4 {
public static void main(String[] args) {
	
	String [] names= {"Sunny","Kajal","Mallika","Kareena","Kalina"};
	
	Predicate<String> startsWithk = s->s.charAt(0)=='K';
	
	for(String s:names) {
		if(startsWithk.test(s)) {
			System.out.println(s);
		}
	}
}
}
