package object.oriented.programming;
/*this keyword: used as method argument in-order to represent current class obj.
 * this keyword: used also in-case of method-chaining
 * method-chaining: In order to call multiple methods on object(this keyword is used)
 */

//Constructor Chaining
//Constructor will always return same class object
public class ThisDemo2 {
	
	 ThisDemo2() {
		 this(245);
		System.out.println("Default cons..");
	}
	
	ThisDemo2(int x){
		this(24,23);
		System.out.println(x);
	}
	
	ThisDemo2(int x, int y){
		System.out.println(x);
		System.out.println(y);
	}

public static void main(String[] args) {
	new ThisDemo2();
}
}
