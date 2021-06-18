package com.pradeep.array;

import java.util.ArrayList;
import java.util.List;

public class ArrangeNagativePsoitive_5 {
	
	public static void arrange(int[] arr) {
		List<Integer> neg= new ArrayList<Integer>();
		List<Integer> pos= new ArrayList<Integer>();
		
		for(int n:arr) {
			if(n<0) {
				neg.add(n);
			}else {
				pos.add(n);
			}
		}
		
		int count=0;
		for(Integer ne:neg) {
			arr[count]=ne;
			count++;
		}
		
		for(Integer po:pos) {
			arr[count]=po;
			count++;
		}
		
		for(int z:arr) {
			System.out.print(z+" ");
		}
		
	}
	public static void main(String[] args) {
		 int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		arrange(arr);
	}

}
