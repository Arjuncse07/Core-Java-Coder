package oops.encapsulation;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your name:");
	String name=sc.next();
	System.out.println("Enter you pass:");
	String pass=sc.next();
	
	Login login= new Login(name,pass);
	//login.setName(name);
	//login.setPass(pass);
	System.out.println(login.getName()+" "+login.getPass());
}
}
