package com.arjun.constructor;
/*
 * Fundamental Example For the Constructor Overloading
 */
 class Cons {
 int sid;
 String sname;
 double sfee;
 
 Cons(){
	 
 }
 
  Cons(int id) {
	 sid= id;
	 System.out.println("int sid");
 }
  Cons(String name) {
		 sname=name;
		 System.out.println("String sname");
  }
  
  Cons(double fee) {
		 sfee= fee;
		 System.out.println("Double sfee");
		 
}
  
  Cons(int id,String name,double fee){
	  sid=id;
	  sname=name;
	  sfee= fee;
  }
  
  public static void main(String[] args) {
	Cons s= new Cons();
	System.out.println("s:"+s.sid+ "...." +s.sname+"..."+s.sfee);
	
	Cons s1= new Cons(123);
	System.out.println("s1:"+s1.sid+ "...." +s1.sname+"..."+s1.sfee);
	
	
	Cons s2= new Cons("Amit");
	System.out.println("s2:"+s2.sid+ "...." +s2.sname+"..."+s2.sfee);
	
	Cons s4= new Cons(5000.256);
	System.out.println("s4:"+s4.sid+ "...." +s4.sname+"..."+s4.sfee);
	
	Cons s5= new Cons(133,"Amit",500.52);
	System.out.println("s1:"+s5.sid+ "...." +s5.sname+"..."+s5.sfee);
}
}
