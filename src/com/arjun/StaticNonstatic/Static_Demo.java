package com.arjun.StaticNonstatic;

public class Static_Demo {
	/*Can We Create Object Inside a Static Block?
	 * ans:Yes we can create method inside a static block
	 */
	
	static 
	{
		//
		Static_Demo st= new Static_Demo();
		System.out.println(st);
	}
	public static void main(String[] args) {
		//We cannot invoke static object 
		//System.out.println(st);
	}

}
