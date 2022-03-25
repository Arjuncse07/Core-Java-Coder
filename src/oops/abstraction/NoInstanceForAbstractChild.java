package oops.abstraction;

public class NoInstanceForAbstractChild extends NoInstanceForAbstract {

	@Override
	public void childShouldImplement() {
     System.out.println("Implementing an abstract method");
	}

}
