package com.arjun.operators.ShortCircuitOP;

public class Equals5 {
    public static void main(String[] args) {
        Thread thread=  new Thread();
        Thread thread2= new Thread();
        Thread thread3=thread;

        System.out.println(thread==thread2);
        System.out.println(thread2==thread3);
    }
}
