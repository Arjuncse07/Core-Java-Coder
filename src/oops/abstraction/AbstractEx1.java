package oops.abstraction;
/*Abstract class:
 * Can't create object of the abstract class.
 * Having abstract method is optional.
 * Having only declaeration.
 */
abstract class Amit{
	abstract void brush();
	abstract void bath();
	abstract void eat();
	abstract void code();
   Amit(){
	   
   }
   }
class Sumit extends Amit{

	@Override
	void brush() {
		System.out.println("Sumit brush");
		
	}

	@Override
	void bath() {
		System.out.println("Sumit bath");
		
	}

	@Override
	void eat() {
		System.out.println("Sumit eat");
		
	}

	@Override
	void code() {
		System.out.println("Sumit code");
		
	}
	
}
class Ravi extends Amit{

	@Override
	void brush() {
		System.out.println("Sumit brush");
		
	}

	@Override
	void bath() {
		System.out.println("Sumit bath");
		
	}

	@Override
	void eat() {
		System.out.println("Sumit eat");
		
	}

	@Override
	void code() {
		System.out.println("Sumit code");
		
	}
	
}
public class AbstractEx1 {
public static void main(String[] args) {
	try {
		Class c= Class.forName(args[0]);
		Amit amit=(Amit)c.newInstance();
		amit.eat();
		amit.bath();
		amit.code();
		amit.brush();
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}
