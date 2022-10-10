package com.arjun.Collections.AL;

import java.util.ArrayList;
import java.util.List;

public class ArraryList7 {
public static void main(String[] args) {
		
	//addAll() Approch: Adding many collection into another collection: many to one
	ArrayList<Integer> ss= new ArrayList<>();
	ss.add(10);
	ss.add(20);
	
	ArrayList<Integer> ss21= new ArrayList<>(); 
	ss21.add(100);
	ss21.add(200);
	
	ArrayList<Integer> ss2= new ArrayList<>();
	ss2.addAll(ss);
	ss2.addAll(ss21);
	ss2.add(123);
	System.out.println(ss2);
}
}
