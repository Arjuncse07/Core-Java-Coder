package com.arjun.Array;

   class Studnet {

	public int roll_no;
	public String name;
	
	Studnet(int roll_no, String name)
	{
	 this.roll_no=roll_no;
	 this.name=name;
	}
	
}

    public class Amit
{
	public static void main(String[] args) {
		
		Studnet[] arr;
		
		arr= new Studnet[5];
		
		arr[0]= new Studnet(001, "Arjun");
		arr[1]= new Studnet(92,"Anmitam");
		arr[2]= new Studnet(93, "Satname");
		arr[3]= new Studnet(894,"Sataya");
		arr[4]= new Studnet(904,"Sripal");
		
		for(int i=0; i<arr.length; i++) 
		{
			System.out.println("Element at "+i + "  :"+arr[i].roll_no + " " +arr[i].name);
		}
	}
}