package com.arjun.interf.Client;

import com.arjun.interf.Businees.Businees;

public class TestClient {

	public static void main(String[] args) {
	  Businees b = new Businees();
	  System.out.print(b);
	  System.out.println();
	  b.withdraw();
	  b.deposite();
	}

}
