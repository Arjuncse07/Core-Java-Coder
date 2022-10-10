package object.oriented.programming;

class Address{
	String city,street,colony;
	{
		city="New Delhi";
		street="DK Road";
		colony="A26";
	}
	Address(){
		System.out.println("Address default cons..");
	}
}

class Salary{
	int ta,da,hra;
	{
		ta=1212;
		da=4434;
		hra=232;
	}
	
	Salary(){
		System.out.println("Salary default cons..");
	}
}
//InitBlockDemo5 is treated as Employee (Assume)
public class InitBlockDemo5 {
	
	String name;
	int age;
	Address address;
	Salary salary;
	
	{
		address= new Address();
	}
	
	{
		salary= new Salary();
	}
	
	void show() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address.city+" "+address.colony+" "+address.street);
		System.out.println("Salary:"+salary.ta+" "+salary.da+" "+salary.hra);
	}
	
	 InitBlockDemo5(String n, int a) {
		name=n;
		age=a;
	}
	public static void main(String[] args) {
		InitBlockDemo5 ii= new InitBlockDemo5("Arjun", 25);
		ii.show();
	}
	
}
