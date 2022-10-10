package com.arjun.Clone;

public class CloneForOca {
   

    public static void main(String[] args) {
        int[][] x= {{10,20,30},{40,50,60}};
        int[][] y= x.clone();
        x[0][1]=7777;
        x[1][2]=9999;
        System.out.println(y[0][1]+":"+y[1][2]);
    }
}
