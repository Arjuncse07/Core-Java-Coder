package com.arjun.abstractcls;

public abstract class Bank {
	
	int amt=100;
	final int rate=10;
	static int loanRate = 5;
    //Abstraction ------> Partial Abstarction
	//Hiding implements logic is called Abstraction..
	//Abs class has abs methods and non abs method...
	
	public abstract void loan();  //abstaract methods
	//non-abstract methods
	public void credit()
	{
		System.out.println("Bank--Credit");
	}
	
	public void debit()
	{
		
		System.out.println("Bank--Debit");
	}
}
