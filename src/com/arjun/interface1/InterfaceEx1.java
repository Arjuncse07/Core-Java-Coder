package com.arjun.interface1;
//If a class extend A class which are having same method in an interface, then it is not mandatory to implements
// that interface.
class A {
	public void show() {
		
	}
public void submit() {
		
	}
}
class B{
	public void submit() {
		
	}
}

public class InterfaceEx1 extends A {                         //implements DemoInterface (optional)
public static void main(String[] args) {
	
}
}
