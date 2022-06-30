package com.arjun.java8.LambdaExp;
//Squaring by using lambda Expression
//Functional interface is used to invoke the lambda expression
interface Interf5{
	public int getSquare(int a);
}

public class Test4 {
public static void main(String[] args) {
	Interf5 i= (a)->a*a;
	System.out.println(i.getSquare(10));
	System.out.println(i.getSquare(50));
}	

}
