package com.pradeep.array;

import java.util.HashMap;
import java.util.Map;

public class ArrayUnion_6 {
	
	public static void arrUnion(int [] a,int[] b) {
		Map<Integer,Integer> data= new HashMap<Integer, Integer>();
		
		for(int x:a) {
			if(data.containsKey(x)) {
				data.put(x, data.get(x)+1);
			}else {
				data.put(x, 1);
			}
		}
		
		for(int x:b) {
			if(data.containsKey(x)) {
				data.put(x, data.get(x)+1);
			}else {
				data.put(x, 1);
			}
		}
		System.out.println("Union elements size:"+data.size());
		String s="";
		System.out.println("Union elements");
		for(Integer ud:data.keySet()) {
			System.out.print(ud+" ");
			if(data.get(ud)>1) {
				s=s+ud+"";
			}
		}
		System.out.println();
		System.out.println("Intersection value:"+s);
		
		
	}
	public static void main(String[] args) {
		int [] arr= {85, 25, 1, 32, 54, 6};
		int [] b= {85,2};
		arrUnion(arr,b);
	}

}
