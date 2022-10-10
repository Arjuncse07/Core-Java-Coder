package object.oriented.programming;

import java.util.Scanner;

public class MyOnlineTrainee {
String name, clgname,mobile;
int age,id;

void showInfo() {
	System.out.println("Name:"+name);
	System.out.println("ClgName:"+clgname);
	System.out.println("Mobile:"+mobile);
	System.out.println("Age:"+age);
	System.out.println("Id:"+id);
}

void chat() {
	System.out.println("Trainess are chating..");
}

void read() {
	System.out.println("Trainess are reading..");
}

void setData(String n, String cl,String m,int a, int b) {
	name=n;
	clgname=cl;
	mobile=m;
	age=a;
	id=b;
}
public static void main(String[] args) {
	new MyOnlineTrainee().clgname="SSBBSVM";
	new MyOnlineTrainee().age=10;
	new MyOnlineTrainee().mobile="09809089";
	new MyOnlineTrainee().read();
	
	MyOnlineTrainee myOnlineTrainee= new MyOnlineTrainee();
	System.out.println(myOnlineTrainee);
	System.out.println("++++++++++++Details of the First Trainee+++++++++++++++++++++++");
	myOnlineTrainee.age=19;
	myOnlineTrainee.clgname="SSCCVV";
	myOnlineTrainee.name="Virat";
	myOnlineTrainee.mobile="355435553";
	myOnlineTrainee.read();
	myOnlineTrainee.showInfo();
	
	System.out.println("++++++++Details of the Second Trainee+++++++++++++++++++++++++++++");
	MyOnlineTrainee myOnlineTrainee2;
	myOnlineTrainee2= new MyOnlineTrainee();
	/*System.out.println(myOnlineTrainee2); //we can't define print the ref. variable before assigning data.
	
	myOnlineTrainee2.name="Simran";
	myOnlineTrainee2.age=13;
	myOnlineTrainee2.clgname="DJB";
	myOnlineTrainee2.mobile="39420380"; */
	
	//myOnlineTrainee2.showInfo();
	myOnlineTrainee2.read();
	myOnlineTrainee2.age=23;
	myOnlineTrainee2.clgname="Ratan";
	myOnlineTrainee2.name="Arujn";
	myOnlineTrainee2.id=2;
	myOnlineTrainee2.showInfo();
	
	System.out.println("=====================================================================");
	
	MyOnlineTrainee myOnlineTrainee3; //This is eat by GC. 
	
	MyOnlineTrainee myOnlineTrainee4= new MyOnlineTrainee();
	System.out.println(myOnlineTrainee4);
	System.out.println(myOnlineTrainee);
	System.out.println(myOnlineTrainee2);
	//System.out.println(myOnlineTrainee3);
	myOnlineTrainee4.name="Aruju Singh";
	myOnlineTrainee4.showInfo();
	System.out.println("++++++++++++Details of the More Than one Trainee++++++++++++++");
	
	MyOnlineTrainee myOnlineTrainee5= new MyOnlineTrainee();
	myOnlineTrainee5.setData("Ravi", "RBS", "3048048", 12, 1);
	myOnlineTrainee5.showInfo();
	myOnlineTrainee5.setData("Kabir", "RBV", "3343434", 12, 2);
	myOnlineTrainee5.showInfo();
	myOnlineTrainee5.setData("Adesh", "ACE", "334343", 13, 3);
	myOnlineTrainee5.showInfo();
	
	
	System.out.println("Enter Data By the User");
	Scanner sc= new Scanner(System.in);
	System.out.println("Details are:");
	System.out.println("");
	System.out.println("Name...");
	String n=sc.next();
	System.out.println("College Name:");
	String cl=sc.next();
	System.out.println("Mobile:");
	String m=sc.next();
	System.out.println("Age:");
	int a=sc.nextInt();
	System.out.println("ID:");
	int i=sc.nextInt();
	
	System.out.println("Details of the Enter Employee");

	MyOnlineTrainee myOnlineTrainee6= new MyOnlineTrainee();
	myOnlineTrainee6.setData(n, cl, m, a, i);
	myOnlineTrainee6.showInfo();
}
}
