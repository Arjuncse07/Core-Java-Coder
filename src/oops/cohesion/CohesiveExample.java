package oops.cohesion;

class ArithmeticOperation {
	public void addition(int a, int b) {
		int sum = a + b;
		System.out.println("Additon of two numbers" +a+ "and" +b+ "is" +sum);
	}

}

class CharacterOpertation {
	public void findingVowel(char a) {
		switch (a) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(a + "is Vowel");
			break;
		default:
			System.out.println(a + "is not a vowel");
		}
	}
}

public class CohesiveExample {
	public static void main(String[] args) {
		int a = 10;
		int b = 50;
		char c = 't';
		char d = 'o';

		ArithmeticOperation obj = new ArithmeticOperation();

		CharacterOpertation obj1 = new CharacterOpertation();
		obj.addition(a, b);
		obj1.findingVowel(c);
		obj1.findingVowel(d);
	}
}
