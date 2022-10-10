package com.arjun.interface1;

public class Athelete implements Runner {

	double distance1;
	@Override
	public int number() {
		System.out.println("Inside the number Method implementations");
		return 100;
	}
	
	public Athelete( double distance1) {
		this.distance1=distance1;
		System.out.println(distance1);
		System.out.println(distance);
	}
	public static void main(String[] args) {
		Athelete athelete= new Athelete(60);
		int number1=athelete.number();
		System.out.println(number1);
		System.out.println(athelete);
	}

}
