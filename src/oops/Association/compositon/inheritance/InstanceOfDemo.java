package oops.Association.compositon.inheritance;
/*InstanceOf: operator is used to define type of refrence variable
 * Rule: Child class Reference variable is of Child type as well as Parent Type(when we use Inheritance)
 * the child class object is of child type as well as Parent type also.
 */
class Parent11{
	
}

public class InstanceOfDemo extends Parent11{
public static void main(String[] args) {
	
	InstanceOfDemo demo= new InstanceOfDemo();
	InstanceOfDemo demo1= null;
	System.out.println(demo instanceof InstanceOfDemo);
	System.out.println(demo instanceof Object);
	System.out.println(demo1 instanceof InstanceOfDemo);
	System.out.println(demo instanceof Parent11);
	
	Parent11 parent11 = new Parent11();
	System.out.println(parent11 instanceof InstanceOfDemo);
	System.out.println(parent11 instanceof Parent11);
	
	Parent11 parent112= new InstanceOfDemo();
	System.out.println(parent112 instanceof Parent11);
	System.out.println(parent112 instanceof InstanceOfDemo);
}
}
