package com.arjun.Stream.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Strems1 {
	
	public static void main(String[] args) {
		ArrayList< Integer> l1= new ArrayList<Integer>();
		for(int i=0; i<=10; i++) {
			l1.add(i);
		}
		System.out.println(l1);
		
		//Using Stream Concept
		List<Integer> l2=l1.stream().filter(i-> i%2==0).collect(Collectors.toList());
		System.out.println(l2);
	}

}
