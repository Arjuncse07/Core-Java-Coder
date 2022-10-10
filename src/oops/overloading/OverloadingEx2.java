package oops.overloading;
//Method Overloading
class Product{
	public int multiply(int a, int b) {
		int prod= a*b;
		return prod;
	}
	public int multiply(int a, int b, int c) {
		int prod=a*b*c;
		return prod;
	}
}
public class OverloadingEx2 {

public static void main(String[] args) {
	Product product = new Product();
	
	int prod1=product.multiply(12, 12);
	System.out.println("Product of the two integers are:"+prod1);
	
	int prod2= product.multiply(12,12, 12);
	System.out.println("Product of three integers are:"+prod2);
}
}
