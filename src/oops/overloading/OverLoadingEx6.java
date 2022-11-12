package oops.overloading;
//Type-promotion in overloading
class Animal{
	
}
class Monkey extends Animal{
	
}
public class OverLoadingEx6 {
	
	public void m1(Animal m) {
		System.out.println("Animal method");
	}
	public void m1(Monkey monkey) {
		System.out.println("Monkey");
	}
	
	public static void main(String[] args) {
		OverLoadingEx6 ex6= new OverLoadingEx6();
		
		Animal animal= new Animal();
		ex6.m1(animal); //animal
		
		Monkey monkey= new Monkey();
		ex6.m1(monkey); //monkey
		
		Animal animal2= new Monkey();
		ex6.m1(animal2); //animal
	}

}
