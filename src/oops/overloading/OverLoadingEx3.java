package oops.overloading;
//Overloading won't consider the return type and access modifiers and throws keyword
public class OverLoadingEx3 {
	public String name;
	public int age;
	public int amitMethod(String name, int age) {
	    System.out.println("My own implimantation");
		return 10;
	}
	
	public String amitMethod(String name) {
		System.out.println("Amit method");
		return "amit";
	}
	
	public static void main(String[] args) {
		OverLoadingEx3 ex3= new OverLoadingEx3();
		ex3.amitMethod("sumit", 20);
		ex3.amitMethod("dolly");
	}

}
