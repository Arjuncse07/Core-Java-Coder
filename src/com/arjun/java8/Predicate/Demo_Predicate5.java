package com.arjun.java8.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/*Remove null and empty string using predicate
 * 
 */
public class Demo_Predicate5 {
	public static void main(String[] args) {
		
		String[] names= {"Durgesh","","Arjun","",null,"Shiva","Fuzan"};
		Predicate<String> p=s-> s!=null && s.length()!=0;
		
		ArrayList<String> list=new ArrayList<String>();
		for(String s:names) {
			if(p.test(s)) {
				list.add(s);
			}
		}
		System.out.println("The list of valid names are:");
		System.out.println(list);
	} 

}
