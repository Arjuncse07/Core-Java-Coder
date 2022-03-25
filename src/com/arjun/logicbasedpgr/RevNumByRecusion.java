package com.arjun.logicbasedpgr;

public class RevNumByRecusion {
	
	public static void rev(int number)
	{
		if(number<10)
		{
		System.out.print(number);	
		}else
		{
			System.out.print(number%10); //98765%10-> 5 9876%10->6 , 7 ,8
			rev(number/10);//98765/10-->9876 987 98 9
		}
	}
	
	
	
	public static void main(String[] args) {
		rev(98765);
		
	}

}
