package com.arjun.constructor;
/* Rules of Cons in case of Inheritence:
 * Before executing any child class cons. firstly execute its immediate parent class default cons. implicitly
 * Why? :In-order to initialize parent data member
 * How? : During compilation compiler add super keyword on default cons. not parametrised
 *  super will be first line of cons
 *  this is also first line of cons
 *  super and this always first line on cons
 *  super and this is not be in same cons.
 */
class Demo11{
	Demo11(){
		System.out.println("Demo11 cons..");
	}
}
class Amit extends Demo11{
	
	Amit(int x){
		this();
		System.out.println(x);
	}
	
	
	Amit(){
		System.out.println("Amit cons..");
	}
}
public class ConsInheritance3 extends Amit {
 ConsInheritance3() {
	 super(30);
	System.out.println("ConsInheritence3 cons.....");
}
 public static void main(String[] args) {
	new ConsInheritance3();
}
}
