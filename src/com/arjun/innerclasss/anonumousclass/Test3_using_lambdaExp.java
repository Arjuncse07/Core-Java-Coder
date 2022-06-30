package com.arjun.innerclasss.anonumousclass;
interface Itef{
	public void m1();
}

public class Test3_using_lambdaExp {
int x=10;
public void m2() {
	int y=20;
	Itef i=()->{
		   System.out.println(x);
		   System.out.println(y); //local variable referenced from lambda expression
		   /*Local variable referenced from lambda expression is final variable
		    * If we declare or not declare it should we declare as final
		    * If we using local variable from lambda expression is declare as final automatically
		    */
	};
	i.m1();
}
public static void main(String[] args) {
	Test3_using_lambdaExp t1=new Test3_using_lambdaExp();
	t1.m2();
}
}
