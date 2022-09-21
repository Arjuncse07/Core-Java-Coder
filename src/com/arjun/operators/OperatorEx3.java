package com.arjun.operators;
/** Arithmetic Operator Precedence
   (/) -> gives quotient (%) gives remainder
Precedence:  High: * / %
              Low: + -
 */
public class OperatorEx3 {
public static void main(String[] args) {
	{
		  double exp1 = (3.0 * 2 / 4);
		  int exp2 = (3 * -2 % 4);
		 
		  System.out.println(exp1);
		  System.out.println(exp2);
		  }
}
}
