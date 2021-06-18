package com.pradeep.array;

public class Sellstock_17 {

	public static void sellStock(int []prices) {
		int max =0;
		
		for(int i=0;i<prices.length;i++) {
			for(int j=i+1;j<prices.length;j++) {
				if(prices[j]-prices[i]>max) {
					max=prices[j]-prices[i];
				}
			}
		}
		
		System.out.println(max);
		
	}
	
	public static int  sellStockNew(int [] arr) {
		int min=arr[0]; 
		int profit=0;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}else {
				if(arr[i]-min>profit)
				profit=arr[i]-min;
			}
		}
		
		return profit;
		
	}
	public static void main(String[] args) {
		int [] arr= {7,1,5,3,6,4};
		int []arr1= {7,6,4,3,1};
		//sellStock(arr1);
		System.out.println(sellStockNew(arr));
	}
}
