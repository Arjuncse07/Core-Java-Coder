package com.arjun.interfaceDemo;

public interface Car {
	
	int wheels =4;
	//only final and static variables can be define..
	//For Interface variable we can perform initilization at the time of declaration.
	//interface  methods always will be public abstract 
	//NO METHOD BODY
	//ONLY METHOD DECLARATION
	//100% ABSTRACTION WILL BE ACHIVED.... because methods are public abstract
	//CANT CREATE OBJECT OF INTERFACE
	//Constructor not applicable for interface
	
	public void start();
	public  void stop();
	public void refule();

}
