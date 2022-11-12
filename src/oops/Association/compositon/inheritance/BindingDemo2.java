package oops.Association.compositon.inheritance;
class Parent12{
	int x=10;
	static int y=20;
	void show() {
		System.out.println("Show of parent..");
	}
	static void display() {
		System.out.println("static display..");
	}
	public Parent12() {
		System.out.println("Parent cons...");
	}
	class Derived12 extends Parent12{
		int x=30;
		static int y=40;
		void show() {
			System.out.println("show of the Derived..");
		}
		static void display() {
			System.out.println("derived display...");
		}
		public Derived12() {
			System.out.println("Derived cons...");
		}
	}
public class BindingDemo2 {
  public static void main(String[] args) {
	try {
		Class c= Class.forName(args[0]);
		Parent12 parent12=(Parent12)c.newInstance();
		System.out.println(parent12.x);
		System.out.println(parent12.y);
	     parent12.show();
	     parent12.display();
	}catch (Exception e) {
		e.printStackTrace();
	}
}
	
}
}
