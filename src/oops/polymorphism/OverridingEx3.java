package oops.polymorphism;

//Overriding w.r.t to variables
// static-- static
class Parent3 {
	static int x = 999;
}

class Child2 extends Parent3 {
	static int x = 888;
}

public class OverridingEx3 {
	public static void main(String[] args) {
		Parent3 parent = new Parent3();
		System.out.println(parent.x); // 999

		Child2 child = new Child2();
		System.out.println(child.x); // 888

		Parent3 parent2 = new Child2();
		System.out.println(parent2.x); // 999
	}

}
