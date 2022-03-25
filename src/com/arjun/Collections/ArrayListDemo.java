package com.arjun.Collections;

import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo
{
public static void main(String[] args) {
	//list is used when our frequent operation is adding an element
	//ArrayList is used when our frequent operation is retrival an element
	List<Integer> inArrayList1= new ArrayList<>();
	inArrayList1.add(1);
	inArrayList1.add(2);
	inArrayList1.add(3);
	inArrayList1.add(4);
	inArrayList1.add(5);
	System.out.println(inArrayList1);
	System.out.println("************************");
	
	List<Integer> inArrayList2= new ArrayList<>();
	inArrayList2.add(10);
	inArrayList2.add(20);
	inArrayList2.add(30);
	inArrayList2.add(40);
	inArrayList2.add(50);
	
	System.out.println(inArrayList2);
	System.out.println("*************************");
	
	List<Integer> inArrayList3 = new ArrayList<>();
	inArrayList3.add(100);
	inArrayList3.add(200);
	inArrayList3.add(300);
	inArrayList3.add(400);
	inArrayList3.add(500);
	System.out.println(inArrayList3);
	System.out.print("********************");
}
}
