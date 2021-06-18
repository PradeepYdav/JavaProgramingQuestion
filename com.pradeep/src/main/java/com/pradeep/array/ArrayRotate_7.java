package com.pradeep.array;

public class ArrayRotate_7 {
	
	public static void rotate(int[] arr) {
		int []x=new int[arr.length];
		x[0]=arr[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			x[i]=arr[i-1];
		}
		for(int z:x) {
			System.out.print(z+" ");
		}
	}
	
	public static void rotate2(int[] arr) {
		
		int x=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=x;
		
		for(int z:arr) {
			System.out.print(z+" ");
		}
		
	}
	
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};
		//5,1,2,3,4,5
		//rotate(a);
		rotate2(a);
	}

}
