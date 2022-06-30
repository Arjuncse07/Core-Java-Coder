package com.arjun.Design_Patterns.Singleton_DP;

public class SingletonClass {

	//making  a singlton class
	//Step:1
	private static SingletonClass singletonInstance= new SingletonClass();
	
	//Step:2 Making a default constructor
	private SingletonClass() {
		
	}
	
	//Step:3 Get the only object available
	public static SingletonClass getInstance() {
		return singletonInstance;
	}
		
		public void simpleMethod() {
			System.out.println("Hashcode of the singleton object::::" + singletonInstance);
		}
	}
	
