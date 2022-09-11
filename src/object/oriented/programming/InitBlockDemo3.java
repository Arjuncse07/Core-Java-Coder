package object.oriented.programming;
public class InitBlockDemo3 {

	 InitBlockDemo3() 
	 {
     System.out.println("default cons..");
	 }
	 
	 {
		 System.out.println("init block..2");
	 }
	 {
		 System.out.println("init block==1");
	 }
	 
	 public static void main(String[] args) {
		
		 {
			 System.out.println("init block 5");
		 }
		 
		 System.out.println("main");
	     }
	
	 {
		 System.out.println("init block 4");
	 }
}
