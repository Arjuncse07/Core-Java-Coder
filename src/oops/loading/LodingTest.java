package oops.loading;
/*Types of Loading: 1.Static CL 2.Dynamic CL
 * Static CL:Compiler have already knowledge about loaded class.
 * when we use any other class into our class.
 *   Static Data Member class
 *   Object create
 *   Inheritance
 * Non-Static CL:Compiler do not have knowledge about the loaded class.
 * -> forName method of class Class is used to dynamic load the class.
 */

class A{
	static int x=10;
	static {
		System.out.println("A is Loaded");
	}
}
class B{
	static {
		System.out.println("B is Loaded");
	}
}
//public class LodingTest extends B  { //using inheritance
public class LodingTest{
	static {
	//	A a= new A();  //using object create
	//	B b= new B();
		System.out.println(A.x);  //using static data member class
		System.out.println("LoadingTest is loaded..");
		System.exit(0); //method terminated
	}
public static void main(String[] args) {
	System.out.println("main...");
}
}
