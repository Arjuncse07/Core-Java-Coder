package com.arjun.Clone;

/*Shallow Cloning creating exact duplicate copy but the dependent 
 * object is not clone, its reference will be copied.
 */
class Address {
	String houseNumber="124-Akbarpur";
	String streetName="Nagau Road";
	String city="FIROZABAD";
	
	public String toString() {
		return "houseNumber="+houseNumber+"\nstreetName="+streetName+"\ncity="+city;
	}
}

class Student implements Cloneable
{
	String name="Arjun";
	String id="A001";
	Address address= new Address();
	
	public String toString() {
		return "name="+name+"\nid="+id;
	}
	
	public Student clone() throws CloneNotSupportedException{
		Student student= (Student)super.clone();
		return student;
	}
}

public class ShallowClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1= new Student();
		System.out.println("---Original Object---");
		System.out.println(s1);
		System.out.println(s1.address);
		System.out.println("Hash code of s1:"+s1.hashCode());
		System.out.println("-------------------------------------------------------------------");
		//Perform Cloning Process
		Student s2= s1.clone();
		System.out.println("---Cloned Object----");
		System.out.println(s2);
		System.out.println(s2.address);
		System.out.println("Hash Code of s2:"+s2.hashCode());
		System.out.println("---------------------------------------------------------------------");
		if(s1.address== s2.address) {
			System.out.println("--Shallow Cloning Process Done");
		}else {
			System.out.println("--Deep Cloning Process Done");
		}
	}

}
