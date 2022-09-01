package com.arjun.varArgs;

class Demo {
void add(int...a) {
	int c=0;
	for(int i=0; i<a.length; i++) {
		c=c+a[i];
	}
	System.out.println("sum="+c);
}

void mul(int[] a) {
	int c=1;
	for(int i=0; i<a.length; i++) {
		c=c*a[i];
	}
	System.out.println("mul="+c);
}

public static void main(String[] args) {
	Demo d= new Demo();
	d.add(10);
	d.add(10,20,30);
	d.add(new int[] {10,20,30,40,50,60});
	d.mul(new int[] {10,20,30,40});
	d.mul(new int [] {
			10,20,30,40,40});
	
	//d.mul();
	
	/*We can not overload 2 methods which can take arrays as parameter and second one take ellipsis as 
	 * parameter.
	 * void add(int ...a){}  --> ellipsis operator
	 * void add(int[] a){}   --> array as parameter
	 */
}
	
}
