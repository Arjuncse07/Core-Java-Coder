package oops.Association.compositon.inheritance;
/*Method Hiding: Override sequence: static - static
 * Method-Resolution takes care by Compiler based on the reference object
 */
class Nimmo{
static void arjun() {  //static method 
	System.out.println("Nimmo:arjun");
}
}

public class MethodHiding {
static void arjun() {  //static method overridden method
	System.out.println("Method hiding: arjun");
}

public static void main(String[] args) {
	MethodHiding hiding= new MethodHiding();
	hiding.arjun();
}
}
