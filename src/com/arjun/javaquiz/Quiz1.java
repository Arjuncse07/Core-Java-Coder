package com.arjun.javaquiz;

public class Quiz1 {
	int phone=123454;
	
	double getPhone()
	{
		System.out.println("phone number received..");
		return phone;
	}
	public static void main(String[] args) {
		Quiz1 qz= new Quiz1();
		System.out.println(qz.getPhone());
	}

}
