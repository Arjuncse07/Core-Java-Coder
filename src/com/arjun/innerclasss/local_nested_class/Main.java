package com.arjun.innerclasss.local_nested_class;
/*Local Nested class are the class which are declare inside any method, constructor block
 * It is treated as a local variable
 * It can have only non-static member
 * It can not be declare static because we can not have static local variable.
 * The object of the class can not be created outside its enclosing class scope directly.
 * It can implement Interface
 * The object of the class can not be created directly from outside its enclosing scope.
 * Rule:It can access only final variable of its enclosing scope.
 */

class Main //Outer class
{
	int x=10;
	static int y=20;
	
	void display() {
		final int z=56;  //rule
		
		class Inner
		{
			void show() {
				System.out.println(x);
				System.out.println(y);
				System.out.println(z);
			}
		}
		
		Inner i=new Inner();
		System.out.println("display");
		i.show();
		}
	public static void main(String[] args) {
	   Main o=new Main();
		o.display();
	}
	
	
	
	
}
