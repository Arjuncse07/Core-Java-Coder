package com.arjun.enumdemo;
//enum is a group of named constant..
public class Main {
	enum Transport{
		PLANE(600),TRAIN(80),AUTOMOBILE(52),BICYCLE(25);
		
		int speed;
		Transport(int s){
			speed=s;
		}
	}
	public static void main(String[] args) {
		Transport tp = Transport.AUTOMOBILE;
		if (tp.ordinal()<2) {
			System.out.println("Not an automobile");
			
		}else {
			System.out.println("It is AUTOMOBILE");
		}
		
	}
}
