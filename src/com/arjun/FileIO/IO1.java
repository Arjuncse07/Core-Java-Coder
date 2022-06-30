package com.arjun.FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IO1 {

	public static void main(String[] args) {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("java2.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			Emp emp1 = new Emp();
			emp1.setEmpAddr("FZD");
			emp1.setEmpDept("CSE");
			emp1.setEmpid(111);
			emp1.setEmpName("Anil");

			oos.writeObject(emp1);

			FileInputStream fis = new FileInputStream("java2.txt");

			ObjectInputStream ois = new ObjectInputStream(fis);

			Emp emp = (Emp) ois.readObject();
			System.out.println(emp.getEmpAddr());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getEmpid());
			System.out.println(emp.getEmpDept());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
