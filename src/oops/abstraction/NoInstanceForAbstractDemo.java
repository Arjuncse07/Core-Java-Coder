package oops.abstraction;

public class NoInstanceForAbstractDemo {
/*
 * Can we create an Instance for an Abstract class in Java?
 * No- In Java, we cannot create an instance of Abstract class.
 */
	public static void main(String[] args)
	{
		//NoInstanceForAbstract instanceForAbstract = new NoInstanceForAbstract();
		
		//Child class
		NoInstanceForAbstractChild abstractChild= new NoInstanceForAbstractChild();
		
		//Abstract method forced to implement by child class
		abstractChild.childShouldImplement();
		
		 //Inherited parent class method..
		abstractChild.MethodInAbstractClass();
			
		}
}
