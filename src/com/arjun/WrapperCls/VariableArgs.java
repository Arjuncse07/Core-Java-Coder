package com.arjun.WrapperCls;
//var-args : variable length argument

/*public class VariableArgs {               Before
void show() {
	System.out.println("Null");
}
void show(int x) {
	System.out.println(x);
}
void show(int x,int y) {
	System.out.print(x+y);
}
public static void main(String[] args) {
	VariableArgs args2= new VariableArgs();
	args2.show();
	args2.show(1);
	args2.show(12, 23);
}
}  */

public class VariableArgs {
	void show(int... x) { // var-args method will take n number of arguments
		// for(int i=0;i<x.length; i++) //homogenous type arguments
		for (int i : x) // using for-each loop
			System.out.println(i);
		// System.out.println(x[i]);
	}

	public static void main(String[] args) {
		VariableArgs args2 = new VariableArgs();
		args2.show(12, 12, 12, 2);
		// args2.show(23);
	}
}
