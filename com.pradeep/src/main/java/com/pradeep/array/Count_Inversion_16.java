package com.pradeep.array;

public class Count_Inversion_16 {
	
	public static void countInversion(int[] arr) {
		int count=0;
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		//int arr[] = {2, 4, 1, 3, 5};
		int arr[]  = {2, 3, 4, 5, 6};
		countInversion(arr);
	}

}
