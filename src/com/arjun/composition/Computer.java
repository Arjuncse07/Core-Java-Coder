package com.arjun.composition;
/*
 * 
 */
class HardDisk {
    HardDisk() {
		System.out.println("Hardisk is strong"); //Composition is strong relation
	}
}
class Ram{
	Ram(){
		System.out.println("Ram is strong"); //Composition is strong relation
	}
}

class MotherBoard1{
	 MotherBoard1() {
		System.out.println("MotherBoard is a strong part"); //Composition is strong relation
	}
}
class Speaker{
	void print() {
		System.out.println("Speaker is weak"); //Aggregation is weak relation
	}
}
class Monitor{
	void print1() {
		System.out.println("Monitor is also weak"); //Aggregation is weak relation
	}
}
public class Computer {  
  HardDisk hardDisk;
  Ram ram;
  MotherBoard1 motherBoard1;
  Speaker speaker;
  Monitor monitor; 
  
  public Computer() {
	monitor = new Monitor();
	hardDisk= new HardDisk();
	ram=new Ram();
	speaker= new Speaker();
	motherBoard1= new MotherBoard1();
}
  
  public static void main(String[] args) {
	  Computer computer= new Computer();
	  computer.speaker.print();
	  computer.monitor.print1();
}
}
