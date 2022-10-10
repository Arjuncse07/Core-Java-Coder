package com.arjun.operators;
/** Arithmetic Operator Precedence
   (/) -> gives quotient (%) gives remainder
Precedence:  High: * / %
              Low: + -
 */
public class OperatorEx9 {
public static void main(String[] args) {
	{
		 int x = 6;
		 long y = 3;
		 
		if(x % 3 >= 1)
		   y++;
		   y--;
		 System.out.print("Value of y: " +y);
		
		  }
}
}
