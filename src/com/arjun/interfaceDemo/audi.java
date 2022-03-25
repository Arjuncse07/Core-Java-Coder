package com.arjun.interfaceDemo;

public class audi implements Car {

	@Override
	public void start() {
		System.out.println("Audi--starts");

	}

	@Override
	public void stop() {
		System.out.println("Audi-Stop");

	}

	@Override
	public void refule() {
		System.out.println("Audi--Refule");

	}

}
