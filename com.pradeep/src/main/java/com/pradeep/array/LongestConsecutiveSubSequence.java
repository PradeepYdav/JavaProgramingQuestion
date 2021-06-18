package com.pradeep.array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubSequence {
	
	public static void sequence(int[] arr) {
		Set<Integer> set= new HashSet<>();
		int max=0;
		for(int num:arr) {
			set.add(Integer.valueOf(num));
		}
		
		for(int num:set) {
			
			if(!set.contains(num-1)) {
				int currentNum=num;
				int currentStreak=1;
				while(set.contains(currentNum+1)) {
					currentStreak+=1;
					currentNum+=1;
				}
				max=max> currentStreak? max:currentStreak;
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		int a[] = {2,6,1,9,4,5,3};
		sequence(a);
	}

}
