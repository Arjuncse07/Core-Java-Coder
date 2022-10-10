package com.arjun.Clone;

public class Clone3 {
    public static void main(String[] args) {
        int[][] x={{10,20,30},{40,50,60}};
        int[][] y=x.clone();
        int[] z=x[0].clone();
        System.out.println(x==y); //false
        System.out.println(x[1]==y[1]); //true
        System.out.println(x[0]==y[0]); //true
        System.out.println(x[0]==z); //false
        System.out.println(x.equals(y)); //false
    }
}
