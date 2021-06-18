package com.pradeep.array;

import java.util.HashMap;

public class Duplicate_Number_11 {
	
	public static void duplicateNumber(int[] arr) {
		HashMap<Integer,Integer> data= new HashMap<>();
		for(int num:arr) {
			if(data.containsKey(num)) {
				data.put(num, data.get(num)+1);
			}else {
				data.put(num, 1);
			}
		}
		
		for(Integer key:data.keySet()) {
			if(data.get(key)>1) {
				System.out.println(key);
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
			int[] nums = {1,3,4,2,2};
			duplicateNumber(nums);
	}

}
