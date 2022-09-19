package com.arjun.constructor;
//Constructor Chaining
public class ConsChaining {
	 ConsChaining() {
	System.out.println("default cons...");
	}
	 ConsChaining(int x){
		 this();
		 System.out.println(x);
		 System.out.println("Printing x");
	 }
	 
	 ConsChaining(int x, String name){
		 this(x);
		 System.out.println(x);
		 System.out.println(name);
		 System.out.println("Printing x and y");
	 }
     
	 public static void main(String[] args) {
		ConsChaining chaining= new ConsChaining(12, "Amit");
		ConsChaining chaining2= new ConsChaining(12);
				}
}
