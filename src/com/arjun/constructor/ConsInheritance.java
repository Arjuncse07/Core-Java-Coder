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
class K{
	K(){
		System.out.println("K cons..");
	}
}
class L extends K{
	L(){
		System.out.println("L cons..");
	}
}
public class ConsInheritance extends L {
 ConsInheritance() {
	System.out.println("ConsInheritence cons.....");
}
 public static void main(String[] args) {
	new ConsInheritance();
}
}
