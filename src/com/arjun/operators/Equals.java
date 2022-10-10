package com.arjun.operators.ShortCircuitOP;

public class Equals {
    public static void main(String[] args) {
        String s= new String("durga");
        StringBuilder sb= new StringBuilder("durga");
        System.out.println(s.equals(sb)); //meant for 
       // System.out.println(s==sb); CE:because there is non relation bw the arguments, then == is raise compilation fails
    }
}
