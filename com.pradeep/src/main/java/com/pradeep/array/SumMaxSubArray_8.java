package com.pradeep.array;

public class SumMaxSubArray_8 {
	
	public static void maxsum (int[] arr) {
		int max=Integer.MIN_VALUE;
		int current=0;
		for(int num:arr) {
			current=current+num;
			if(current>max) {
				max=current;
			}
			if(current<0) {
				current=0;
			}
		}
		System.out.println(max);
	}
	
	public static void main (String [] args) {
		int arr[] = {1,2,3,-2,5};
		maxsum(arr);
		
	int	arr1[] = {-2,-1,-2,-3,-4};
	maxsum(arr1);
	
	int arr2[]= {-2, -3, 4, -1, -2, 1, 5, -3};
	maxsum(arr2);
	}

}
