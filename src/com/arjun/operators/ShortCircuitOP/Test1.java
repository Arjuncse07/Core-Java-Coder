package com.arjun.operators.ShortCircuitOP;

public class Test1 {
	public static void main(String[] args) {
		int a,b,c,d;
		//Compound Assignment Operator
		//This operator is traversing from Right-to-Left
		a=b=c=d=20;
		a+=b-=c*=d/=2;
	System.out.println(a+" "+b+" "+c+" "+d);	
	}

}
//op:-160 -180 200 10
