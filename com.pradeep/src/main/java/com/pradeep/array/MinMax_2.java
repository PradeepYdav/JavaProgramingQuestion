package com.pradeep.array;

public class MinMax_2 {

	
	public static void minMax(int[] arr) {
		int min=arr[0];
		int max=min;
		
		for(int n:arr) {
			if(n<min) {
				min=n;
			}
			if(n>max) {
				max=n;
			}
		}
		System.out.println("Min:"+min+", Max:"+max);
	}
	
	public static void main(String [] args) {
		  int arr[] = {1000, 11, 445, 1, 330, 3000};
		minMax(arr);
	}
}
