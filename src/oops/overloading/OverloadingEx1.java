package oops.overloading;
//Method Overloading
public class OverloadingEx1 {
void show(int x) {
	System.out.println(x);
}
void show(int x,int y) {
	System.out.println(x);
	System.out.println(y);
}
void show(int x, int y, int z) {
	System.out.print(x);
	System.out.println(y);
	System.out.println(z);
}
public static void main(String[] args) {
	OverloadingEx1 ex1= new OverloadingEx1();
	ex1.show(10);
	ex1.show(12, 12);
}
}
