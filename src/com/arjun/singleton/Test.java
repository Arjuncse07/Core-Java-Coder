package com.arjun.singleton;

public class Test {
	private static Test t= null;
	private Test() {
		
	}
	public static Test getTest() {
		if (t== null) {
			t=new Test();
			
		}
		return t;
	}

}
class Client{
	public static void main(String[] args) {
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
	}
}