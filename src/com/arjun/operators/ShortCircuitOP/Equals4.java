package com.arjun.operators.ShortCircuitOP;

public class Equals4 {
    public static void main(String[] args) {
        Object object= new Object();
        Thread thread= new Thread();
        String string= new String();

        System.out.println(object==thread);
      //  System.out.println(thread==string); there is no relation bw thread and string so compilation fails
        System.out.println(string==object);
    }
}
