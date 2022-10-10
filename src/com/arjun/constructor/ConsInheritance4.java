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
class Demo1{
	Demo1(){
		System.out.println("Demo1 cons..");
	}
	Demo1(int x){
		System.out.println(x);
	}
}
class Sumit extends Demo1{
	
	Sumit(int x){
		this();
		System.out.println(x);
	}
	
	
	Sumit(){
		this(23,5);
		System.out.println("Sumit cons..");
	}
	
	Sumit(int x, int y){
		super(29);
		System.out.println(x);
		System.out.println(y);
	}
}
public class ConsInheritance4 extends Sumit {
 ConsInheritance4() {
	 super(30);
	System.out.println("ConsInheritence3 cons.....");
}
 public static void main(String[] args) {
	new ConsInheritance4();
}
}
