package com.arjun.Collections.AL;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraryList2 {
public static void main(String[] args) {
	ArrayList object= new ArrayList<>();
	object.add(new Employee(111, "sumit"));
	object.add(new Student(222, "Mhanagan"));
	object.add(null);
	
	for( Object o :object) {
		if(o instanceof Employee) {
			Employee emp= (Employee)o;
			System.out.println(emp.ename+ "  " +emp.eid);
		}
		
		if( o instanceof Student) {
			Student stu= (Student)o;
			System.out.println(stu.sname+ "  "+ stu.sid);
		}
		
		if(o==null) {
			System.out.println(o);
		}
		
	}
	
	Student ss= (Student)object.get(1);
	System.out.println(ss.sname + " "+ss.sid);
}
}

//If the collections are not type safe then while reading the data 
//at runtime we have perform Type casting process, but it is not recommended.