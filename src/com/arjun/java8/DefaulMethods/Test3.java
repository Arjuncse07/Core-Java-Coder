package com.arjun.java8.DefaulMethods;
/*interface static method w.r.t Overriding
*Overriding is not valid for interface static method
*Case:1
*/
/*interface Intef{
	public static void m1() {
		System.out.println("Interface_m1()");
	}
}
public class Test3 implements Intef {
	
public static  void m1() {
	System.out.println("Test3_Class_m1()");
}
public static void main(String[] args) {
	Test3.m1();
	Intef.m1();
}
	
}*/

/*Case:2 
 * 
 * static method in Interface
 * non-static method in Main class
 */

/*interface Intef1{
	public static void m1() {
		System.out.println("interface_m1()");
	}
}

class Test3 implements Intef1{
	public void m1() {
		System.out.println("class_level_m1()");
	}
	Test3 t= new Test3();
	t.m1();
	
	Intef1.m1();
}*/


/*Case:3
 *
 */
interface Inteface2{
	public static void m1() {
		System.out.println("Interface_m1()");
	}
}
class Test3 implements Inteface2{
	public static void m1() {
		System.out.println("Test3_m1()");
	}
	public static void main(String[] args) {
		Inteface2.m1();
		Test3.m1();
	}
}
