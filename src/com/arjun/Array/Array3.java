package com.arjun.Array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Print Duplicate Element in Array
public class Array3 {

	public static void main(String[] args) {

		int arr[] = { 1, 6, 4, 7, 8, 4, 7, 9, 3, 8 };
		Set<Integer> uniqueNumber = new HashSet<Integer>();
		boolean isDuplicateExist = false; // Flag

		for (int i = 0; i < arr.length; i++) {
			if (uniqueNumber.contains(arr[i])) {
				isDuplicateExist = true;
				System.out.println("Duplicate Element " + arr[i]);
			} else {
				uniqueNumber.add(arr[i]);
			}
		}
		if (!isDuplicateExist) {
			System.out.println(-1);
		}

	}

}
