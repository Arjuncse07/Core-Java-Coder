package com.arjun.Clone;

import java.util.Scanner;

class Employee implements Cloneable
{
	String name;
	String id;
	public Employee(String name, String id) {
		this.id=id;
		this.name=name;
		
	}
	public String toString() {
		return "name="+name+"\nid="+id;
	}
	public Employee clone() throws CloneNotSupportedException {
		return (Employee)super.clone();
	}
	
}

public class ObjectClone {
public static void main(String[] args) throws CloneNotSupportedException {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Employee Name:");
	String name= sc.nextLine();
	System.out.println("Enter Employee id:");
	String empId=sc.nextLine();
	
	Employee obj1= new Employee(name, empId);
	System.out.println("--Display From the original object--");
	System.err.println(obj1);
	System.err.println("Hash Code of obj1:"+obj1.hashCode());
	
	Employee obj2=obj1.clone();
	System.out.println("----Disply from Cloned Object----");
	System.out.println(obj2);
	System.out.println("Hash Code of obj2:"+obj2.hashCode());
	sc.close();
}
}
