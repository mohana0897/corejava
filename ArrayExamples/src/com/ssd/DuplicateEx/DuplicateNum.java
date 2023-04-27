package com.ssd.DuplicateEx;

import java.util.HashSet;
import java.util.*;

public class DuplicateNum {
	public static void main(String[] args) {
		int arr[] = { 2, 1, 3, 4, 5, 1, 4, 5, 1, 1,1,1,2,2,9,9,9 };
		Set<Integer> duplicate=new HashSet<>();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					duplicate.add(arr[i]);

				}
			}

		}
		System.out.println("No of repeated elements are "+duplicate);

	}
}
