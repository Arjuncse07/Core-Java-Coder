package com.arjun.OCA;
public class Class11 {
	
		public static void main(String[] args) {
			String a, b, c;
			c = new String("mouse");
			a = new String("cat");
			b = a;
			a = new String("dog");
			c = b;
			System.out.println(c);
		}
}