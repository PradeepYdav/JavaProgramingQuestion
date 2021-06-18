package com.pradeep.array;

import java.awt.image.SampleModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Integer> arr= new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		long min=arr.get(0);
		long max=min;
		long sum=0;
		
		for(Integer x:arr) {
			sum=sum+x;
			
			if(x<min) {
				min=x;
			}
			if(x>max) {
				max=x;
			}
		}
		System.out.println(min);
		System.out.println(max);
		System.out.println(sum);
		System.out.println("max"+(sum-min));
		System.out.println("min"+(sum-max));
	  
	}

}
