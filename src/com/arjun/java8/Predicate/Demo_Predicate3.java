package com.arjun.java8.Predicate;

import java.util.function.Predicate;

/*::::::::::::::Predicate Joining:::::::::::::::::::
 * Question
 * 1.Given number is greater than 10?
 * 2.Is Even number?
 *  use method  negate();
 */
public class Demo_Predicate3 {
public static void main(String[] args) {
	
	int [] x= {0,5,10,15,20,25,30};
	Predicate<Integer> p1=i->i>10;
	Predicate<Integer> p2=i->i%2==0;
	
	System.out.println("The number is greater than 10 are:");
	m1(p1,x);
	
	System.out.println("The even numbers are:");
	m1(p2,x);
	
	System.out.println("The numbers not Greater than 10 are:");
	m1(p1.negate(),x);
	
	System.out.println("The numbers are Greater than 10 and Even numbers are: ");
	m1(p1.and(p2),x);
	
	System.out.println("The numbers Greater than 10 or Even numbers are:");
	m1(p1.or(p2),x);
}
public static void m1(Predicate<Integer>p,int[] x) {
	//Iteration by using for each loop
	for(int x1:x) {
		if(p.test(x1)) {
			System.out.println(x1);
		}
	}
}
}
