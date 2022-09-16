package oops.loading;

import java.util.Scanner;

/*Types of Loading: 1.Static CL 2.Dynamic CL
 * Static CL:Compiler have already knowledge about loaded class.
 * when we use any other class into our class.
 *   Static Data Member class
 *   Object create
 *   Inheritance
 * Non-Static CL:Compiler do not have knowledge about the loaded class.
 * -> forName method of class Class is used to dynamic load the class.
 */

class A11{
	static int x=10;
	static {
		System.out.println("A11 is Loaded");
	}
}
class B11{
	static {
		System.out.println("B11 is Loaded");
	}
}
//public class LodingTest extends B  { //using inheritance
public class LodingTest2{
	static {
		System.out.println("Loading Test is loaded..");
	}
public static void main(String[] args) throws ClassNotFoundException {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter class you want to load..");
	String name=sc.next();
	Class.forName(name);
	System.out.println("main...");
}
}
