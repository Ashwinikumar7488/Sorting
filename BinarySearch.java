package com.ty.search;

import java.util.Scanner;

//In Binary Search, sorted array is the prerequisite
public class BinarySearch {
	public static int binary(int[] arr, int x) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (x == arr[mid]) {
				return mid;
			} else if (x > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int z[]= {3, 4, 0, 8, 6, 10, 17, 12, 15, 21, 19};
		//Sorted Array
		int a[] = BubbleSortAlg.sort(z);
		System.out.println("Enter the element to search:");
		int element = s.nextInt();
		System.out.println("The index of element to be searched is :"+binary(a, element));
	}
}
