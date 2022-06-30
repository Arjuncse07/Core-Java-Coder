package com.arjun.java8.Predicate;

import java.util.function.Predicate;

/*Predicate:To check the particular condition
 *  Predicate is a boolean valued function/method
 *  1.8v
 *  Present in:java.util.function
 *  It is functional Interface:contains single abstract method 
 *  Prototype:::::::::::::::::::::::::::::::::::::::::::::::::
 *  interface Predicate<T>{
	boolean test(T t );
     }
 */

public class Demo_Predicate {
public static void main(String[] args) {
	Predicate<Integer> p= I->I>10;
	System.out.println(p.test(1000)); //true
	System.out.println(p.test(5));   //false
}
}
