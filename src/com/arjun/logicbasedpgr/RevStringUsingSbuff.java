package com.arjun.logicbasedpgr;

//string buffer is mutable so we can use reverse() method in string buffer
public class RevStringUsingSbuff {
	public static void main(String[] args) {
		String s="Arjun";
	
	StringBuffer sb= new StringBuffer(s);
	System.out.println(sb.reverse());

}
}
