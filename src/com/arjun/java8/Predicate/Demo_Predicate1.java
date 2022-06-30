package com.arjun.java8.Predicate;

import java.util.function.Predicate;

public class Demo_Predicate1 {
	public static void main(String[] args) {
		
		Predicate<String> p= s->s.length()>5;
		System.out.println(p.test("abcdef")); //true
		System.out.println(p.test("abc"));   //false
	}

}
