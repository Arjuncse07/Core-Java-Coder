package com.arjun.java8.LambdaExp;

@FunctionalInterface
interface A{
	void show();

}

//class B implements A{
//	@Override
//	public void show() {
//		System.out.println("Hi there");	
//	}

public class Test6 {
//public static void main(String[] args) {
//	//defining anonymous inner class
//	A a= new A()
//	{
//		
//		@Override
//		public void show() {
//		    System.out.println("Hi in show");			
//		}
//		
//	};
//	a.show();
//}
	
	//using lambda expression
	public static void main(String[] args) {
		A object= () ->  System.out.println("Hi in show");
		
		
		{
		System.out.println("Hi in show");	
		};
		
		object.show();
	}
	
	
}
