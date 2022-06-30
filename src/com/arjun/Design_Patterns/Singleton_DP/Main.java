package com.arjun.Design_Patterns.Singleton_DP;

public class Main {
public static void main(String[] args) {
	
	SingletonClass singletonObject= SingletonClass.getInstance();
	singletonObject.simpleMethod();
	
	
	SingletonClass singletonObject2= SingletonClass.getInstance();
	singletonObject2.simpleMethod();
	
	SingletonClass singletonObject3=SingletonClass.getInstance();
	singletonObject3.simpleMethod();
	
	
	Teacher teacher= new Teacher();
	System.out.println(teacher);
	
	Teacher teacher2 = new Teacher();
	System.out.println(teacher2);  
}
}
