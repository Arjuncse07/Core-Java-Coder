package object.oriented.programming;
/*this keyword: used as method argument in-order to represent current class obj.
 * this keyword: used also in-case of method-chaining
 * method-chaining: In order to call multiple methods on object(this keyword is used)
 */

//Method Chaining
public class ThisDemo3 {
	
	//Make method of call type(return current class object)
	ThisDemo3 show() {
	System.out.println("show");
	return this;
	}
	
 	ThisDemo3 disp() {
		System.out.println("Display");
		return this;
		
	}
	
	void hello() {
		System.out.println("Hello");
	}
	
public static void main(String[] args) {
	new ThisDemo3().show().disp().hello();;  //we can call method chaining using this keyword
}
}
