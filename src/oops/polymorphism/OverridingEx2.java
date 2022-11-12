package oops.polymorphism;
//Overriding w.r.t to variables
//static -- non-static
class Parent2{
	static int x=999;
}
class Child1 extends Parent2{
	int x=888;
}
public class OverridingEx2 {
	public static void main(String[] args) {
		Parent2 parent=new  Parent2();
		System.out.println(parent.x); //999
		
		Child1 child= new Child1();
		System.out.println(child.x); //888
		
		Parent2 parent2= new Child1();
		System.out.println(parent2.x); //999
	}

}
