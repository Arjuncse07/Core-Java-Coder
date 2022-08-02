package com.arjun.as;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

//public class A {
//
//	public static void check() {
//		System.out.println("1");
//	}
//	
//	public static int check() {
//		return 1;
//		
//	}
//	public static void main(String[] args) {
//		check();
//	}
//}


//public class A
//{
//	void display(A t) {
//		System.out.println("Test");
//	}
//	
//	void display(String str) {
//		System.out.println("String");
//	}
//	
//	public static void main(String[] args) {
//		new A().display(null);
//	}
//}

//class Hello{
//	public void showNumber() {
//		System.out.println(10);
//		return;
//	}
//	
//}
//
//class A{
//	public static void main(String[] args) {
//		Hello h= new Hello();
//		h.showNumber();
//	}
//}


//class A{
//	public static void main(String[] args) {
//		int a[]= {10,20,3,};
//		System.out.println(a.length);
//	}
//}



//class A{
//	public static void main(String[] args) {
//		
//		List t= new ArrayList<>();
//		t.add(1);
//		t.add(2);
//		t.add(3);
//		
//        t.add(5);
//        t.add(4);
//        System.out.println(Collections.binarySearch(t, 4));
//	}
//}

//class A{
//	public static void main(String[] args) {
//		TreeSet s1= new TreeSet();
//		TreeSet subset1= new TreeSet();
//		
//		for(int i=604; i<617; i++) {
//			if(i%2 ==0) {
//				s1.add(i);
//			}
//			
//			subset1= (TreeSet)s1.subSet(606, 613);
//			s1.add(629);
//			subset1.add(629);
//			System.out.println(s1+ " "+subset1);
//		}
//		
//	}
//}


//class A{
//	public static void main(String[] args) {
//		
//		try {
//			int i=5/0;
//			
//		}
//		catch (Exception e) {
//			throw new Exception();
//		}finally {
//			System.out.println("In Finally");
//		}
//	}
//}

class A{
//	int x=12;
//	
//	public void method1(int x) {
//		x+=x;
//		System.out.println(x);
//	}
	
	void get(long a) {
		System.out.println("Inside Long");
	}
	
	void get(double f) {
		System.out.println("Inside Double");
	}
	public static void main(String[] args) {
		
//		String st1= "XYZ";
//		String st2= "IMS";
//		String st3= st1+st2;
//		String st4="XYZIMS";
//		System.out.println(st3==st4);
		
//		A a= new A();
//		a.method1(5);
//		System.out.println(a.x);
		
		
		new A().get(10);
	}
}
