package object.oriented.programming;
/*this keyword: used as method argument in-order to represent current class obj.
 * 
 */
class B{
	static void m1(A a) {
		System.out.println("m1");
		a.display();
	}
}

class A{
	void show() {
		System.out.println("show");
		B.m1(this);
	}
	
	void display() {
		System.out.println("display");
	}
}
public class ThisDemo {

public static void main(String[] args) {
	A a= new A();
	a.show();
}
}
