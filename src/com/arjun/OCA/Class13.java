package com.arjun.OCA;
class Demo{
	public int var1=20;
	public int var2=30;
	Demo(int v1, int v2){
		var1=v1;
		var2=v2;
	}
}
public class Class13 {
public static void main(String[] args) {
	Demo demo= new Demo(20,30);
    System.out.println(demo.var1);
    System.out.println(demo.var2);
}
}
