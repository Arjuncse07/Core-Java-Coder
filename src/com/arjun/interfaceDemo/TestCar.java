package com.arjun.interfaceDemo;

public class TestCar {
public static void main(String[] args) {
	
	BMW b = new BMW();
	b.start();
	b.stop();
	b.refule();
	b.theftSafety();
	
	//Parent class object (methods) available to child 
	//but child class methods not available to parent
	Car c= new BMW();
	c.start();
	c.stop();
	c.refule();

}
}
