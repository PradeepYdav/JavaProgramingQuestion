package com.pradeep.array;

import java.util.Arrays;

public class KthSmallest_3 {
	
	public static void kthsmall(int[] arr,int k) {
		Arrays.sort(arr);
		System.out.println(arr[k-1]);
	}
	public static void main(String[] args) {
		int [] arr={ 12, 3, 5, 7, 19 };
		kthsmall(arr, 3);
	}

}
