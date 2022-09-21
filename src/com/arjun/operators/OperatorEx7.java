package com.arjun.operators;
/** Arithmetic Operator Precedence
   (/) -> gives quotient (%) gives remainder
Precedence:  High: * / %
              Low: + -
 */
public class OperatorEx7 {
public static void main(String[] args) {
	{
		 int a = 20, b = 10;
		  boolean c = true, d = false;
			a = c ? b++ : b--;
			c = !d;
			System.out.print((a+b)+" "+(c ? 5 : 10));
		  }
}
}
