package com.arjun.Collections.AL;

import java.util.ArrayList;

public class ArraryList4 {
public static void main(String[] args) {
	ArrayList al= new ArrayList<>();
	al.add(10);
	al.add("arjun");
	al.add(10); //DP are allowed
	al.add(null); //null insertion 
	al.add(10.5); 
	System.out.println(al);
	System.out.println(al.size());
	
	al.add(3, "rohan");
	System.out.println(al);
	
	al.remove(2);
	al.remove("arjun");
	System.out.println(al);
	
	al.set(1, "xxx");
	System.out.println(al);
   
    System.out.println(al.isEmpty());
    al.clear();
    System.out.println(al.isEmpty());
}
}

