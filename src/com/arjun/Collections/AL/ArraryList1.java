package com.arjun.Collections.AL;

import java.util.ArrayList;

public class ArraryList1 {
public static void main(String[] args) {
	//Collections are not Type safe that's why we add Generics.
	
	ArrayList al= new ArrayList<>();
	al.add(10);
	al.add("arjun");
	al.add(10); //DP are allowed
	al.add(null); //null insertion 
	al.add(10.5); 
	System.out.println(al);
	System.out.println(al.toString());
}
}
