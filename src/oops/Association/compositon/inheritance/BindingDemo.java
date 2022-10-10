package oops.Association.compositon.inheritance;
class Parent {
	int x=10;
	static int y=20;
	void show() {
		System.out.println("Parent show,..");
	}
	
	static void display() {
		System.out.println("Parent Display");
	}
}
class Derived extends Parent{
	int x=20;
	static int y=30;
	void show () {
		System.out.println("BindingDemo show...");
	}
	static void display() {
		System.out.println("BindingDemo Display...");
	}
}
public class BindingDemo extends Parent{
public static void main(String[] args) {
	Parent parent = new BindingDemo();
	System.out.println(parent.x);
	System.out.println(parent.y);
     parent.show(); 
     parent.display();
	
}
}
