package com.arjun.Clone;

public class Clone2 {
    public static void main(String[] args) {
        int[][] x={{10,20,30},{40,50,60}}; //shallow cloning
        int[][] y=x.clone();   // 
        System.out.println(x==y);     // false refrence comparison of the x and y will not same

        System.out.println(x.equals(y)); // false because in memory x is pointing to another object y is pointing to another .equals are not overriden for the array. so object class method will call.
                                        
        System.out.println(x[0]==y[0]); // true because both pointing to same element
        System.out.println(x[0].equals(y[0])); //true //refrence comp object class equals method
    }
}
