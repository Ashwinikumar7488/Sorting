package com.ty.search;

public class BubbleSortAlg {

	public static int[] sort(int[] arr) {
		for(int i=0; i< arr.length-1;i++) {
			for(int j=0; j< arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int a[] = {1, 0, 4, 9, 12, -3, 3};
		int[] res =sort(a);
		System.out.println("Sorted array is: ");
		for (int k = 0; k < res.length; k++) {
			System.out.print(res[k]+" ");
		}
	}
}
