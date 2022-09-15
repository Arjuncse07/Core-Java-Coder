package com.arjun.StaticNonstatic;

public class Static_Demo3 {
  static int x,y;
  {
	  x=10;
  }
  Static_Demo3(){
	  System.out.println("Default Cons..");
  }
  
  Static_Demo3(int x){
	  System.out.println(x);
  }
  
  Static_Demo3(int x, int y){
	  System.out.println(x);
	  System.out.println(y);
  }
  
  static
  {
	  x=19;
	  y=20;
	  System.out.println("Static Block1..");
	  new Static_Demo3();
  }
  
  static
  {
	  System.out.println("Static Block2..");
  }
  
  static
  {
	  System.out.println("Static Block3");
  }
  
  {
	  System.out.println("init:block1");
  }
  
  {
	  System.out.println("initblock2");
  }
  
  public static void main(String[] args) 
  {
	System.out.println("main..");
	new Static_Demo3();
	new Static_Demo3(20);
	new Static_Demo3(10, 50);
	
	{
		System.out.println("Main init ke jaisa hu");
	}
	
   } 
  
}
