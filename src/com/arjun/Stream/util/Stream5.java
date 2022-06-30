package com.arjun.Stream.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream5 {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("Suman");
		al.add("Amit");
		al.add("Abishek");
		al.add("Bycott");
		al.add("Catilina");
		al.add("Dolly");
		
		System.out.println(al);
		
		List<String> l=al.stream().collect(Collectors.toList());
		
		System.out.println("Normal Sorting Order:"+l);
		
		List<String> l1=al.stream().sorted((s1,s2)-> s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("Accorrding to customized sorting order:"+l1);
	}
}
