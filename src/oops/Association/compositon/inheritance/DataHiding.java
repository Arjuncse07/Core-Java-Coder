package oops.Association.compositon.inheritance;
//Data Hiding:Process in which child class data will have the priority
class Base1{
	int x=10;
}

public class DataHiding extends Base1 {
	int x=59;
	void show() {
		//print Parent class Data Method:1
		Base1 base1= new Base1();
		System.out.println(base1.x);
		//print Parent class Data Method:2
		System.out.println(super.x);
		//print the local instance variable
		System.out.println(x);
	}
public static void main(String[] args) {
	DataHiding dataHiding= new DataHiding();
	dataHiding.show();
}
}
