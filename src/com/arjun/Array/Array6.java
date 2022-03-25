package com.arjun.Array;

//Program if an Array contains a specific value
public class Array6 {

	public static boolean contains(int[] arr, int item) {

		for (int n : arr) {
			if (item == n) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] my_arra1 = { 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010, 2013, 2031, 1020, 2015 };
		System.out.println(contains(my_arra1, 2013));
		System.out.println(contains(my_arra1, 2015));
	}

}
