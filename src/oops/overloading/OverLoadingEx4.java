package oops.overloading;

public class OverLoadingEx4 {
	public void m1() {
		System.out.println("no-arg");
	}
	
	public void m1(double d) {
		System.out.println("double");
	}
	public static void main(String[] args) {
		 OverLoadingEx4 ex4= new OverLoadingEx4();
		 ex4.m1(10); //type promotion
	}

}
