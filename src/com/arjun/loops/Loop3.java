package com.arjun.loops;
/* Pattern:3
+ + + + + 
+ + + + 
+ + + 
+ + 
+ 
 */
public class Loop3 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {
		for(int j=i; j<=n; j++) {
			System.out.print("+ ");	
			}
			System.out.println();
		}
	}
}
