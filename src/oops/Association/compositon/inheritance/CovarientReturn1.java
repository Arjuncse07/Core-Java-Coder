package oops.Association.compositon.inheritance;
/*Before JDK 1.5: WE can't override method by changing the return type.
 * From JDK1.5: It is possible to override a method by changing the return type.This concept is called Covariant Return.
 * Need To Follow Some Conditions: 
 * 1.Both class method must have return type is reference type where as primitive data type is not allowed.
 * 2.The classes which is used as return type they also must have relation of parent and child.
 * 3.Parent class method must return parent class object and child class method must return child class object.
 */

class Demo1{
	//method-1
	Demo1 show() {
		System.out.println("show of demo");
		return this;
	}
}
public class CovarientReturn1 extends Demo1 {
    //method-1 overridden
	CovarientReturn1 show() {
		System.out.println("show of coivarient");
		return this;
	}
	
	void display() {
		System.out.println("display method of CovarientReturnn1");
	}
	public static void main(String[] args) {
		CovarientReturn1 return1= new CovarientReturn1();
		return1.show().display();
	}
}
