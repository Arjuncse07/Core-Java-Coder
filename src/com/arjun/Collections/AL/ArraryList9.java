package com.arjun.Collections.AL;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraryList9 {
public static void main(String[] args) {
	//Two Conversion Process
	/* 1.Arrays into Collection: asList()
	 * 2.Collections into Arrays: toArray()
	 */
	
	//Conversion of the arrays to collection
	String[] s= {"ratan","anu","surya"};
	
	ArrayList<String> obj= new ArrayList<String>(Arrays.asList(s));
	obj.add("aa");
	obj.add("vvv");
	System.out.println(obj);
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
	//Generic Version Collection into Arrays
	ArrayList<String> obj1= new ArrayList<String>();
	obj1.add("ratan");
	obj1.add("abu");
	obj1.add("dom");
	
	String[] s1= new String[obj1.size()];
	obj1.toArray(s1);
	for(String ss:s1) {
		System.out.println(ss);
	}
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
	
	//Normal Version of the Collection into Array
	ArrayList data= new ArrayList();
	data.add(10);
	data.add("ratam");
	data.add(23.4);
	
	Object[] o= data.toArray();
	for(Object oo : o) {
		System.out.println(oo);
	}
	System.out.println("++++++++++++++++++++++++++++++++++++");
}
}
