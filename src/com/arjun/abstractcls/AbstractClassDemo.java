package com.arjun.abstractcls;

//Abstract class and their relations
interface I
{
	public abstract void m1();
	public abstract void m2();
}
interface J extends I{
	public abstract void m3();
	public abstract void m4();
}
//Relation b/w abstract class and interface
abstract class L implements J{
	public void m3() {
		System.out.println("L-M3 Methods");
	}
}
//Relation b/w abstract class to abstract class
abstract class M extends L{
	public void m4() {
		System.out.println("M-M4-Method");
	}
	public abstract void m5();
	
	public void m6() {
		System.out.println("M-M6 method");
	}
}

//Relation b/w class to abstract class
class N extends M{
	public void m1() {
		System.out.println("N-M1!");
	}
	public void m2() {
		System.out.println("N-M2");
	}
	/*public void m3() {
		System.out.println("N-M3");
	}
	public void m4() {
		System.out.println("N-M4");
	}*/
	public void m5() {
		System.out.println("N-M5");
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		
		I obj= new N();
		obj.m1();
		obj.m2();
		
		J obj1= new N();
		obj1.m3();
		obj1.m4();
		obj1.m1();
		obj1.m2();
		
		M obj2= new N();
		obj2.m6();
		obj2.m3();
		
	}
}
