package com.arjun.OCA;
public class Class7 {
public static void main(String[] args) {
	int [] array= {4,8,16};
	int i=1;
	array[++i]=--i;
	System.out.println(array[0]+array[1]+array[2]);
	
}
}
