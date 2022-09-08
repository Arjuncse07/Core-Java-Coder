package com.arjun.Collections.AL;

import java.util.ArrayList;

public class ArraryList3 {
public static void main(String[] args) {
	
	//Arrays are type safe
	int[] a= {10,20,30};
	for(int aa: a) {
		System.out.println(aa);
	}
	
	
	//Use Generics to provide Type Safty to the collections
	ArrayList<Employee> emp= new ArrayList<Employee>();
	emp.add(new Employee(111, "Rohan"));
	emp.add(new Employee(222, "Sohan"));
	
	for(Employee ee: emp) {
		System.out.println(ee.ename+ "  "+ee.eid);
	}
	
	Employee ee= emp.get(0);
	System.out.println(ee.ename + " "+ee.eid );
}
}
