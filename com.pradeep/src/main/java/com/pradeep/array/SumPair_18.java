package com.pradeep.array;

public class SumPair_18 {
	
	public static void sumPair(int []arr,int sum) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	public static void main(String args[]) {
		int sum=6;
		int arr[] = {1, 5, 7, 1};
		
		int arr2[] = {1, 1, 1, 1};
		sum=2;
		sumPair(arr2, sum);
	}

}
