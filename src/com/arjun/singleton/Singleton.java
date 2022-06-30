package com.arjun.singleton;

 class Client{
	private static Client t= null;
	private Client() {
		
	}
	public static Client getTest() {
		if (t== null) {
			t=new Client();
			
		}
		return t;
	}

}
public class Singleton{
	public static void main(String[] args) {
		Client t= Client.getTest();
		Client t1=Client.getTest();
		System.out.println(t1);
		System.out.println(t);
		
		//System.out.println(Client.getTest().hashCode());
	}
}