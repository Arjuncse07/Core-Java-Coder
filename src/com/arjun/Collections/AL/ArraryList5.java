package com.arjun.Collections.AL;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraryList5 {
public static void main(String[] args) {

	//If we want to add same type of the objects 
	ArrayList<String> al = new ArrayList<String>(Collections.nCopies(10, "Arjun"));
	System.out.println(al);
	
	ArrayList<String> aa= new ArrayList<>();
	aa.add("sumtita");
	aa.add("dolly");
	aa.add("kabir");
	System.out.println("Before Swapping:" +aa);
	Collections.swap(aa, 1, 2);
	System.out.println("After Swaping:" );
	System.out.println(aa);
	
	
	Employee emp= new Employee(111,"Rhan");
	ArrayList<Employee> al1= new ArrayList<Employee>(Collections.nCopies(5, emp));
	System.out.println(al1.toString());
}
}

