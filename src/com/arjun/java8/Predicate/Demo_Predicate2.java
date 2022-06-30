package com.arjun.java8.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;
/*Checking the collection is Empty or not
 * By the help of Predicate
 * one method is test>>>return type is boolean
 */
public class Demo_Predicate2 {
	public static void main(String[] args) {
		
		Predicate<Collection> p= c->c.isEmpty();
		ArrayList l1=new ArrayList();
		l1.add("a");  //false
		System.out.println(p.test(l1));
		ArrayList l2= new ArrayList();
		System.out.println(p.test(l2)); //true
	}

}
