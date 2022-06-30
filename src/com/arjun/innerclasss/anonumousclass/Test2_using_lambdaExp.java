package com.arjun.innerclasss.anonumousclass;

interface Interf11{
	public void m1();
}

public class Test2_using_lambdaExp {
int x=888;

public void m2() {
	Interf i=()->{
		int x=999;
		System.out.println(this.x); /*pointing to the outer class instance variable
		                            *Inside Lambda Expression this always refer to the outer class instance member
		                            */
		};
	i.m1();
}

public static void main(String[] args) {
	Test2_using_lambdaExp t=new Test2_using_lambdaExp();
	t.m2();
}
}
