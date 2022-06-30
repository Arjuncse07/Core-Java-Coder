package com.arjun.java8.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test1 {
public static void main(String[] args) {
	
	ArrayList<Software_Engineer> list= new ArrayList<Software_Engineer>();
	list.add(new Software_Engineer("Amit", 25, false));
	list.add(new Software_Engineer("Suman", 18, true));
	list.add(new Software_Engineer("Faizal", 25, true));
	list.add(new Software_Engineer("Aman", 54, false));
	list.add(new Software_Engineer("Kartik", 22, true));
	
	Predicate<Software_Engineer> allowed= se->se.age>=18 && se.ishavinggf==true;
	System.out.println("The Allowed members to the club are:");
	for(Software_Engineer se:list) {
		if(allowed.test(se)) {
			System.out.println(se);
		}
	}
}
}
