package oops.polymorphism;
//Overriding w.r.t to variables
class Parent1{
	int x=999;
}
class Child extends Parent1{
	int x=888;
}
public class OverridingEx1 {
	public static void main(String[] args) {
		Parent1 parent=new  Parent1();
		System.out.println(parent.x); //999
		
		Child child= new Child();
		System.out.println(child.x); //888
		
		Parent1 parent2= new Child();
		System.out.println(parent2.x); //999
	}

}
