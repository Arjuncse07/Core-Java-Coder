package object.oriented.programming;

/*Ways to call Non-Static Dm
 * 1.Object.NSDM
 * 2.objectRef.NSDM
 * 3.Directly(NSDM) inside non-static method and constructor.
 */
public class NonStaticDM {
int x=19;

public NonStaticDM() {
	System.out.println(x);
}

void show() {
	System.out.println(x);
}
public static void main(String[] args) {
	System.out.println(new NonStaticDM().x);
	NonStaticDM dm= new NonStaticDM();
	dm.show();
	System.out.println(dm.x);
}
}
