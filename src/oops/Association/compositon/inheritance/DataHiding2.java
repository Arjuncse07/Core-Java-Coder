package oops.Association.compositon.inheritance;
//Up-casting is happens then only down-casting is done
//Without up-casting down-casting is not possible
class ParDadaJi{
	int x=20;
}

class DadaJi extends ParDadaJi{
	int x=100;
}

class Papa extends DadaJi{
	int x=10;
}

public class DataHiding2 extends Papa {
	int x=45;
//	void show(Papa papa, DadaJi dadaJi, ParDadaJi parDadaJi) { //UP-Casting
//		System.out.println(papa.x);
//		System.out.println(dadaJi.x);
//		System.out.println(parDadaJi.x);
//		System.out.println(x);
//	}
	
	void show() {  //Type-Casting
		System.out.println(((Papa)this).x);
		System.out.println(((DadaJi)this).x);
		System.out.println(((ParDadaJi)this).x);
		System.out.println(x);
	}
	
public static void main(String[] args) {
	DataHiding2 dataHiding2= new DataHiding2();
	//dataHiding2.show(dataHiding2,dataHiding2,dataHiding2);  //For Up-Casting
	dataHiding2.show();  //Show method for Type-Casting
	//DadaJi dadaJi= new DataHiding2(); UP-Casting
     	
}
}
