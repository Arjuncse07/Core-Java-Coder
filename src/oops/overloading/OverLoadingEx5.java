package oops.overloading;
//Type-promotion in overloading
public class OverLoadingEx5 {
	public void m1() {
		System.out.println("no-arg");
	}
	public void m1(int i) {
		System.out.println("int-arg");
	}
	
	public void m1(double d) {
		System.out.println("double-arg");
	}
	
	public void m1(float f) {
		System.out.println("Float-arg");
	}
	public static void main(String[] args) {
		 OverLoadingEx5 ex4= new OverLoadingEx5();
		 ex4.m1(); //no-args
		 ex4.m1(10); //int-arg
		 ex4.m1(10.5); //double
		 ex4.m1(10.5f); //float-arg
		 ex4.m1('a'); //int-arg 
		 ex4.m1(10l); //float-arg
		 
	}

}
