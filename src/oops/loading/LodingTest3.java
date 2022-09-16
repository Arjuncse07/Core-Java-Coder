package oops.loading;

import java.util.Scanner;

class A22{
	A22(){
		System.out.println("A cons..");
	}
	static int x=10;
	static {
		System.out.println("A22is Loaded");
	}
}
class B22{
	B22(){
		System.out.println("B cons..");
	}
	static {
		System.out.println("B22 is Loaded");
	}
}
//To create a object without using new keyword
//Just by using newInstance Method
public class LodingTest3{
	static {
		//System.out.println(A.x);  //using static data member class
		System.out.println("LoadingTest is loaded..");
	}
public static void main(String[] args)  {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter class you want to load..");
	String name=sc.next();
	Class c;
	try {
		c = Class.forName(name);
	try {
		c.newInstance();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(c);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("main...");
	
}
}
