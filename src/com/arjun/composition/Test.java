package com.arjun.composition;
public class Test {
	public static void main(String[] args) 
	{
		Case thecase= new Case("5502","Dell","Cmp250v");
		MotherBoard mb= new MotherBoard("BJ22","AMD",4);
		
		PC thePC= new PC(thecase, mb);
		thePC.getMb().loadProgram("Browser");
		thePC.getThecase().PressPowerButton();
	}

}
