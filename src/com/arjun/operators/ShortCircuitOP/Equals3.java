package com.arjun.operators.ShortCircuitOP;

public class Equals3 {
    public static void main(String[] args) {
        Object object= new Object();
        Thread thread= new Thread();
        String string= new String();
        StringBuffer buffer= new StringBuffer();
        StringBuilder builder= new StringBuilder();

        System.out.println(object==null);
        System.out.println(thread==null);
        System.out.println(string==null);
        System.out.println(buffer==null);
        System.out.println(builder==null);
        System.out.println(null==null);
    }
}
