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
  
public class InitBlockDemo2 {
//init block is also used to initilize the data
	int x1=19;
  /* Internally init block is used to initilized the data member
   *  {
   *    Int x1; 
   *   }
   *   
   *   {
   *     x1=19;
   *   }  
   */
	int x;
	
	{
		x=10;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		InitBlockDemo2 nn= new InitBlockDemo2();
		System.out.println(nn);
	}
	
}
