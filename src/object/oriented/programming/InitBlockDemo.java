package object.oriented.programming;
/* Init-Block: It is anonymous block which is used to initilized the data before object creation, must be executed
 *    w.r.t every object.
 *    Execute before constructor
 *    Execute for every block
 *    Able to write any logic inside init block
 *    Do't keep init block inside method because when we keep it inside method it is treated as normal statement.
 *    In a Program we have more than one init block.
 *    In case of more than one init block in porgram their order of execution is determine by their order of 
 *    entries in the class(FCFS)
 */
  
public class InitBlockDemo {

	InitBlockDemo() {
		System.out.println("Default cons..");
	}
	
	InitBlockDemo(int x){
		System.out.println(x);
	}
	
	InitBlockDemo(int x, int y){
		System.out.println(x);
		System.out.println(y);
	}
	
	{
		System.out.println("Inside init block1");
	}
	
	{
		System.out.println("Inside init block2");
	}
	
	{
		System.out.println("Inside init block3");
	}
	
	public static void main(String[] args) {
		new InitBlockDemo();
		new InitBlockDemo(10);
		new InitBlockDemo(12, 20);
	}
}
