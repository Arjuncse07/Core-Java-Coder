package com.arjun.interfaceDemo;

public class BMW implements Car {

	@Override
	public void start() {
		System.out.println("BMW--Starts");

	}

	@Override
	public void stop() {
		System.out.println("BMW--Stops");

	}

	@Override
	public void refule() {
		System.out.println("BMW--Refule");

	}
	
	//non-overridden also
	
public void theftSafety()
{
System.out.println("BMW-THEFT(sAFETY)");
}

}
