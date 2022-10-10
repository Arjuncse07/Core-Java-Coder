package object.oriented.programming;
public class InitBlockDemo4 {
 InitBlockDemo4() {
System.out.println("Default cons.");	
}
 
 {
	 System.out.println("init block2");
 }
 
 {
	 System.out.println("init block1");
 }
	
 public static void main(String[] args) {
	
	 new InitBlockDemo4();
	 new InitBlockDemo4();
	 //init block inside method is not treated as init block
	 {
		 System.out.println("init block5");
	 }
	 
	 System.out.println("main");
}
}
