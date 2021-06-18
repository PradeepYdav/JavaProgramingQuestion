package com.pradeep.array;


public class ReverseArray_1 {
	
	public static void reverse(int[] arr) {
		int x[]= new int[arr.length];
		int z=0;
		for(int i=arr.length-1;i>=0;i--) {
			x[z]=arr[i];
			z++;
		}
		
		for(int l:x) {
			System.out.println(l);
		}
	}
	
	public static void rev2(int [] arr) {
		int start=0;
		int end=arr.length-1;
		for(int i=0;i<arr.length/2;i++) {
			int s=arr[start];
			int e=arr[end];
			arr[end]=s;
			arr[start]=e;
			start++;
			end--;
		}
		
		for(int x:arr) {
			System.out.println(x);
		}
	}
	
	public static void rev3(int[] arr) {
		int start=0;
		int end =arr.length-1;
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
	
	public static void rev4(int[] arr,int s,int e) {
		if(s>=e) {
			return;
		}
		
		int temp=arr[s];
		arr[s]=arr[e];
		arr[e]=temp;
		rev4(arr,s+1,e-1);
	}
	
	
	
	public static void main(String []args) {
		int arr[]={1, 2, 3,4,5,6};
		
		//reverse(arr);
		//rev2(arr);
		//rev3(arr);
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		rev4(arr,0,arr.length-1);
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

}
