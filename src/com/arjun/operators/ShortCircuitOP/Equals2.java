package com.arjun.operators.ShortCircuitOP;

public class Equals2 {
    public static void main(String[] args) {
        String s1= new String("amit");
        String s2= new String("amit");
        System.out.println(s1==s2);
        System.out.println(s1.hashCode()==s2.hashCode());
    }
}
