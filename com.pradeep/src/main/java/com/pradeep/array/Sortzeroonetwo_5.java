package com.pradeep.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Sortzeroonetwo_5 {
	
	public static void zero(int[] arr) {
		
		Map<Integer,Integer> data= new HashMap<>();
		for(int x :arr) {
			if(data.containsKey(x)) {
				int d=data.get(x);
				//d=d+1;
				data.put(x, ++d);
			}else {
				data.put(x, 1);
			}
		}
		
		int count=0;
		for(Map.Entry<Integer, Integer> datas:data.entrySet()) {
			for(int i=0;i<datas.getValue();i++) {
				arr[count]=datas.getKey();
				count++;
			}
			
		}
		System.out.println(data.toString());
		for(int z:arr) {
			System.out.print(z+" ");
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {0 ,2, 1, 2, 0,1,1,2,2,2,0};
		zero(arr);
	}
	
	

}
