package com.arjun.Stream.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams3 {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("Pavan");
		al.add("RaviTeja");
		al.add("Mohan");
		al.add("Suman");
		al.add("Ravichandran Ashvin");
		al.add("Shyam Manohar");
		al.add("Chandrasekhar");
		al.add("Sachin");
		al.add("amitchand");
		//Printing name string greater than 9
		List<String> al2= al.stream().filter(s->s.length()>=9).collect(Collectors.toList());
		System.out.println(al2);
	}
}
