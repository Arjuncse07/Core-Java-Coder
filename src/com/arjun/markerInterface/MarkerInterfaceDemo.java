package com.arjun.markerInterface;
//Marker interface
// Certain marker interfaces in java are 
interface Lottery{
	
}

public class MarkerInterfaceDemo  {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		if(b instanceof Lottery) {
			System.out.println("Hey you have win 1cr");
		}
		else {
			System.out.println("Better luck next time..");
		}
		
	}
}


class A implements Lottery{
	
}

class B{
	
}