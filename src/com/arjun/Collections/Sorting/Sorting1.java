package com.arjun.Collections.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting1 {
public static void main(String[] args) {
	List<Body> list= new ArrayList<Body>();
	list.add(new Body(2, 2, "White", "Male","Dexter"));
	list.add(new Body(2, 2, "Black", "Female","Angelina"));
	list.add(new Body(2, 2, "White", "Male","Ravi"));
	list.add(new Body(4,2,"Black","Male","Sunny"));
	list.add(new Body(4,2,"Black","Male","Dommy"));
	list.add(new Body(4,2,"Black","Female","Dolly"));
	list.add(new Body(4,2,"Black","Male","Dharmesh"));
	list.add(new Body(4,2,"Black","Male","Faizal"));
	list.add(new Body(4,2,"Black","Female","Meera"));
	list.add(new Body(4,2,"Black","Female","Sumitra"));
     Collections.sort(list,new NameComparator());
	
	//sorting done by comparable interface
	System.out.println(list);
	
	//Sorting using name by the help of comparator
	
	System.out.println(list);
   
} 

}
