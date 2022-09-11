package object.oriented.programming;
//Constructor Overloading: Process of having same cons in a program with different parameter.
public class ConstructorCopy {
String name;
int age;

 ConstructorCopy(String n, int a) {
	name=n;
	age=a;
}

 ConstructorCopy(ConstructorCopy cc) {
	name=cc.name;
	age=cc.age;
}
 
 void show() {
	 System.out.println(name);
	 System.out.println(age);
 }
 
 
 public static void main(String[] args) {
	ConstructorCopy constructorCopy= new ConstructorCopy("Ram",23);
	System.out.println(constructorCopy);
	constructorCopy.show();
	
	ConstructorCopy cc= new ConstructorCopy(constructorCopy);
	cc.show();
}
}
