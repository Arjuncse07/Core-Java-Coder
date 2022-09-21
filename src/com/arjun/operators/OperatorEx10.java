package com.arjun.operators;
/** Arithmetic Operator Precedence
   (/) -> gives quotient (%) gives remainder
Precedence:  High: * / %
              Low: + -
 */
public class OperatorEx10 {
public static void main(String[] args) {
	{
		 int a = 4;	
		   int x = a >= 5 ? 1+2 : 1*1;
		  
		   if(++x < 4)
			  x += 1;
		       System.out.println("Value of x: " +x);
		
		  }
}
}
