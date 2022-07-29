package com.arjun.Clone;

/*Deep Cloning creating exact duplicate copy but the dependent Object is
 * also get cloned. 
 */

class Address1 implements Cloneable{
	String streetName="Dayal Street";
	String houseNumber="h1212";
	String laneNumber="Bamb-12o";
	
	@Override
	public String toString() {
		return "Address1 [streetName=" + streetName + ", houseNumber=" + houseNumber + ", laneNumber=" + laneNumber
				+ "]";
	}
	
	public Address1 clone() throws CloneNotSupportedException {
		return (Address1)super.clone();
	}
}


class Student1 implements Cloneable{
	String name="Amit";
	String id="A001";
	
	Address1 address1= new Address1();
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", id=" + id + "]";
	}
	
	public Student1 clone() throws CloneNotSupportedException{
		Student1 student1= (Student1)super.clone();
		student1.address1= this.address1.clone();
	     return student1;
	}
}


public class DeepClone    {
public static void main(String[] args) throws CloneNotSupportedException {
	
	Student1 student1= new Student1();
	System.out.println("--Original Object--");
	System.out.println(student1);
	System.out.println(student1.address1);
	System.out.println("Hash Code of student1:"+student1.hashCode());
	System.out.println("---------------------------------------");
	
	//Perform cloning process
	Student1 student2= student1.clone();
	System.out.println("--Cloned Object---");
	System.out.println(student2);
	System.out.println(student2.address1);
	System.out.println("Hash Code of student2:"+student2.hashCode());
	System.out.println("--------------------------------------------");

	if(student1.address1==student2.address1) {
		System.out.println("--Shallow Cloning");
	}else {
		System.out.println("Deep Cloning");
	}
	
}
}
