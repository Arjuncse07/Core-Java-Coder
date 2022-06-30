package com.arjun.innerclasss.anonumousclass;
/*Anonymous Inner Class
 * 
 * 
 */
	
	interface I1{
		//We have an anonymous class inside this interface
		public int m1();
	}

	public class Test {
		//Anonymous Inner Class
		public static void main(String[] args) {
			
			I1 i=new I1() 
			//This is above the body of the anonymous inner class which
			//is define under interface.
			{

				@Override
				public int m1() {
					System.out.println("This is anonymous method");
					return 1010;
				}
			};
			System.out.println(i);
		    i.m1();
		    System.out.println(i.m1());

}
	}
