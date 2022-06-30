package com.arjun.java8.LambdaExp;

//Without Using Lambda Expression
/*interface Interf2{
	public int getLenght(String s );
}

class Demo implements Interf2{

	@Override
	public int getLenght(String s) {
		return s.length();
	}
	
}
public class Test3 {
public static void main(String[] args) {
	Interf2 i1=new Demo();
	System.out.println(i1.getLenght("Hello without Lambda Expression"));
	System.out.println(i1.getLenght("Suna hai lambda Expression is more powerful"));
}	

}*/

interface Interf4{
	public int getLength(String s);
}

public class Test3{
	public static void main(String[] args) {
		Interf4 i=s->s.length();
		System.out.println(i.getLength("Amit"));
		System.out.println(i.getLength("Lambda Expression"));
		
	}
}
