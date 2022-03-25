package com.arjun.operators.ShortCircuitOP;

public class Test {
	
	public static void main(String[] args) {
		//Case:1 Bitwise & operator
		int x=10;
		int y=15;
		if (++x <10 & ++y>15) {
			x++;
			
		}
		else {
			y++;
			
		}
		System.out.println(x+" "+y);
	}
	//OP:11 17
		
	//Case2:&& short Circuit Operator(AND)
		/*int x=10;
		int y=15;
		if (++x <10 && ++y>15) {
			x++;
			
		}
		else {
			y++;
			
		}
		System.out.println(x+" "+y);
	}*/
	//op:11 16
		
		//Case3: (|)BITWISE OR OPERATOR AND (||)OPERATOR WILL GAVE SAME OUTPUT
		
	/*	int x=10;
		int y=15;
		if (++x <10 || ++y>15) {
			x++;
			
		}
		else {
			y++;
			
		}
		System.out.println(x+" "+y);
	}*/
	//OP:12 16

}
