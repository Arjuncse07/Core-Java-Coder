package com.arjun.constructor;
/* Rules of Cons in case of Inheritence:
 * Before executing any child class cons. firstly execute its immediate parent class default cons. implicitly
 * Why? :
 * How? : During compilation compiler add super keyword on default cons. 
 *  super will be first line of cons
 *  this is also first line of cons
 *  super and this always first line on cons
 *  super and this is not be in same cons.
 */
class c{
	c(){
		System.out.println("C cons");
	}
}
class b extends c{
//	b(){                             //case:1
//		System.out.println("b default cons");
//	}
	b(int x){
		System.out.println(x);
	}
}
public class ConsInheritance2 extends b{
 ConsInheritance2() {
	 super(23);                     //case:2
	System.out.println("ConsInheritence cons.....");
}
 public static void main(String[] args) {
	new ConsInheritance2();
}
}
