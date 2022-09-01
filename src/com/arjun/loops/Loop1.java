package com.arjun.loops;
/* Pattern:1
 + + + + + 
+ + + + + 
+ + + + + 
+ + + + + 
+ + + + +   
 */
public class Loop1 {
	int n=5;
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("+ ");
			}
			System.out.println();
		}
		
	}
}
