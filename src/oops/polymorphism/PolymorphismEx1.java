package oops.polymorphism;
//overriding and poly-morphism
//Modifiers concept in the overriding
//non-final to final applicable
class Parent{
	public void m1() {
		System.out.println("Parent method");
	}
}
public class PolymorphismEx1 extends Parent{
	public final void m1() {
		System.out.println("Child class method");
	}

}
