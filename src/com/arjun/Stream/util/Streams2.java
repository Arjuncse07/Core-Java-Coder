package com.arjun.Stream.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams2 {

	public static void main(String[] args) {
		ArrayList<String> l= new ArrayList<String>();
		l.add("ravi");
		l.add("navi");
		l.add("amit");
		l.add("sumit");
		l.add("suman");
		System.out.println(l);
		
		//Using Lambda Expression and Stream API
		List<String> l2=l.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);
	}
	
}
