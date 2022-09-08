package com.arjun.Collections.AL;

import java.util.ArrayList;

public class ArraryList8 {
public static void main(String[] args) {
	
	ArrayList<Employee> al3= new ArrayList<>();
	al3.add(new Employee(111, "ratan"));
	al3.add(new Employee(222, "dollyr"));
	
	ArrayList<Employee> al4= new ArrayList<>();
	al4.add(new Employee(333, "aruna"));
	al4.add(new Employee(444, "full"));
	
	al4.removeAll(al3);
	al4.retainAll(al3);
	
	for(Employee emp :al3) {
		System.out.println(emp.eid+ " "+emp.ename);
	}
	System.out.println("Operations are completed");
}
}
