package com.arjun.innerclasss.anonumousclass;

interface Interf{
	public void m1();
}


public class Test1 {
int x=888;
public void m2() {
	//making object of the AIC
	Interf i= new Interf() {
		int x=999;
		@Override
		public void m1() {
			System.out.println(this.x); /*pointing to AIC instance variable
			                            *In AIC this always refers to current inner class object
			                            */
			                       
			
		}
	};
	i.m1();
}
public static void main(String[] args) {
	Test1 t=new Test1();
	t.m2();
}
}
