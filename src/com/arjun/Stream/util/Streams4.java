package com.arjun.Stream.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams4 {
	public long count;
	
 public static void main(String[] args) {
	
	 ArrayList<String> al= new ArrayList<String>();
	 al.add("pavan");
	 al.add("suman");
	 al.add("ravi");
	 al.add("kumarranjan");
	 al.add("raviteja");
	 al.add("sumitpanchal");
	 al.add("amitkumarswami");
	 System.out.println(al);
	 System.out.println();
	 System.out.println();
	  
	  List<String> al1= al.stream().filter(s->s.length()>=9).collect(Collectors.toList());
	  System.out.println(al1);
	 long count=al.stream().filter(s->s.length()>=9).count();
	 System.out.println("The number of String lenght is >=9:"+count);
	 
}
}
