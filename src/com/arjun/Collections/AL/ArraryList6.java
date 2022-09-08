package com.arjun.Collections.AL;

import java.util.ArrayList;

public class ArraryList6 {
public static void main(String[] args) {
	//Constructor approch:Adding one collection into another Collection
	ArrayList<String> aj= new ArrayList<String>();
	aj.add("arjun");
	aj.add("anu");
	
	ArrayList<String> a2= new ArrayList<String>(aj);
	a2.add("rani");
	a2.add("yuhan");
	System.out.println(a2);
	
	
	ArrayList<String> a3= new ArrayList<>(a2);
	a3.add("tina");
	a3.add("Funny");
	System.out.println(a3);
}
}
