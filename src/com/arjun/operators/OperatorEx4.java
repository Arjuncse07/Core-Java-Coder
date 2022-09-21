package com.arjun.operators;
/** Arithmetic Operator Precedence
   (/) -> gives quotient (%) gives remainder
Precedence:  High: * / %
              Low: + -
 */
public class OperatorEx4 {
public static void main(String[] args) {
	{
		int x = 9, y = 12, z = 3;
		 
		  int exp1 = x - y/3 + z * 2 - 1; 
		  int exp2 = (x - y)/3 + ((z * 2) - 1); 
		 
		  System.out.println(exp1);
		  System.out.println(exp2);
}
}}
