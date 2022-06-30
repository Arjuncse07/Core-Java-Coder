package com.arjun.innerclasss.staticNestedClass;
//non static outer class
class Outer{
	int p=35;
	static int q=30;
	//static inner class
	/*We can call static data member from the inner static class
	 * Non-static data member can't we call from the inner static class
	 * 
	 */
	static class Inner{
		int x=10;
		static int y=20;
		void show() {
			//System.out.println(p); >>>can't call non-static from the static inner class
			//System.out.println(this.p);
			
			
			System.out.println(q);
			System.out.println("Show");
		}
		
		static void disp() {
			System.out.println("disp");
		}
	}
	
	public static void main(String[] args) {
		
		Outer.Inner i= new Outer.Inner();
		i.show();
		i.disp();
		Outer o= new Outer();
		System.out.println(o.p);
		
		
		
	}
}

 