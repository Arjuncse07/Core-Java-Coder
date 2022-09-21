package com.arjun.operators;
/** Arithmetic Operator Precedence
   (/) -> gives quotient (%) gives remainder
Precedence:  High: * / %
              Low: + -
 */
public class OperatorEx2 {
public static void main(String[] args) {
	 int x = 10, y = 5;
	 
	 int exp1 = (y * (x / y + x / y));
	 int exp2 = (y * x / y + y * x / y);
	 
	 System.out.println(exp1);
	 System.out.println(exp2);
}
}
