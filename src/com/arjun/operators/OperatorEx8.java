package com.arjun.operators;
/** Arithmetic Operator Precedence
   (/) -> gives quotient (%) gives remainder
Precedence:  High: * / %
              Low: + -
 */
public class OperatorEx8 {
public static void main(String[] args) {
	{
		 int x = 10 * (2 + (1 + 2 / 5));
		   int y = x * 2;
		   System.out.print(x + y < 10 ? "Hello" : "Java");
		  }
}
}
