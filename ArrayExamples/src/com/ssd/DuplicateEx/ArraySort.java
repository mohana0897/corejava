package com.ssd.DuplicateEx;

import java.util.Arrays;
import java.util.Iterator;

public class ArraySort {
	public static void main(String[] args) {

		int arr1[] = { 2, 3, 5, 1, 7, 8 };
		int arr2[] = { 21, 39, 87, 19, 27, 81 };
		int arr3[] = { 24, 65, 54, 21, 72, 28 };
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		System.out.println("Sorted arr1 . .");
		for (int i = 0; i < arr1.length; i++) {

			System.out.print(" " + arr1[i]);
		}
		System.out.println();
		System.out.println("Sorted arr2 . .");
		for (int i = 0; i < arr2.length; i++) {

			System.out.print(" " + arr2[i]);
		}
		System.out.println();
		System.out.println("Sorted arr3 . .");
		for (int i = 0; i < arr3.length; i++) {

			System.out.print(" " + arr3[i]);
		}
		System.out.println();
		if(arr1[arr1.length-1]>arr2[arr2.length-1]&&
				arr1[arr1.length-1]>arr3[arr3.length-1]) {
			System.out.println("The bigger number is . . "+arr1[arr1.length-1]);
		}else if(arr2[arr2.length-1]>arr3[arr3.length-1]) {
			System.out.println("The bigger number is . . "+ arr2[arr2.length-1]);
		}else {
			System.out.println("The bigger number is . . "+ arr3[arr3.length-1]);
		}
	}

}
