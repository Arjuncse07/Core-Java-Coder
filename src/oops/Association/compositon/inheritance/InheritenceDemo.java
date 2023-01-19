package oops.Association.compositon.inheritance;

class Base{
	int x=10;
	static int y=20;
	void show() {
		System.out.println("Show of Base");
	}
	static void display() {
		System.out.println("display of base");
	}
}
public class InheritenceDemo extends Base {
	InheritenceDemo(){
		System.out.println(x);
		System.out.println(y);
		show();
		display();
	}
	
	void method() {
		System.out.println(x);
		System.out.println(y);
		display();
		show();
	}
public static void main(String[] args) {
	System.out.println(new InheritenceDemo().x);
	InheritenceDemo demo= new InheritenceDemo();
	//demo.x;
	System.out.println(demo.x);
	
	new InheritenceDemo().show();
	demo.show();
	
	new InheritenceDemo().display();
	display();
	
	InheritenceDemo.display();
	System.out.println(y);
	
	demo.display();
	System.out.println(InheritenceDemo.y);
}
}
