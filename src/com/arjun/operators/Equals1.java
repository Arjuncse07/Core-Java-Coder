package com.arjun.operators.ShortCircuitOP;

public class Equals1 {
    public static void main(String[] args) {
        StringBuilder builder= new StringBuilder("amit");
        StringBuilder builder2= new StringBuilder("amit");
        System.out.println(builder==builder2);
        System.out.println(builder.hashCode()==builder2.hashCode()); //String builder will not overriden for content comparision
        System.out.println(builder.equals(builder2));
    }
}