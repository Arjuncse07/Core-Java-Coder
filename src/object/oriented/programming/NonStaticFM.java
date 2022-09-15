package object.oriented.programming;

/*Ways to call Non-Static Dm
 * 1.Object.NSDM
 * 2.objectRef.NSDM
 * 3.Directly(NSDM) inside non-static method and constructor.
 */
public class NonStaticFM {
void display() {
	System.out.println("Display");
}

public NonStaticFM() {
	display();
}

void show() {
	display();
}
public static void main(String[] args) {
	new NonStaticFM().display();
	NonStaticFM fm= new NonStaticFM();
	fm.display();
	fm.show();
}
}
