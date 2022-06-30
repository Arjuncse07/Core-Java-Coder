package com.arjun.innerclasss.non_static_Insted_Class;

public class A {
	int x=10;
	static int y=20;
	
	//non-static nested class
	 class B{
		int p=30;
		
		void show() {
			System.out.println(x);
			System.out.println(y);
		}
		//we get Compile Time Error
		//static int z=40;
	}
	 public static void main(String[] args) {
		
		 A a= new A();
		 B b= a.new B();
		 System.out.println(b.p);
		 b.show();
	}

}
