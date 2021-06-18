package com.pradeep.array;

import java.util.HashSet;
import java.util.Set;

public class SubarraySumzero_21 {
	
	public static void sumZero(int arr[]) {
		 Set<Integer> hs = new HashSet<Integer>();
		int sum=0;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(arr[i]==0 || sum==0  || hs.contains(sum)) {
				flag=true;
				break;
			}
			
			hs.add(sum);
			
			
		}
		System.out.println(flag);
		
	}
	public static void main(String[] args) {
		int arr[] = { -3, 2, 3, 1, 6 };
		int arr1[]= {4 ,2 ,-3, 1, 6};
		sumZero(arr1);
	}

}
