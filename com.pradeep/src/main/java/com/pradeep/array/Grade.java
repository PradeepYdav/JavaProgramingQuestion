package com.pradeep.array;

import java.util.ArrayList;
import java.util.List;

public class Grade {
	
	public static List<Integer> gradingStudents(List<Integer> grades) {
	    // Write your code here
	    List<Integer> res= new ArrayList<>();
	    for(Integer grade:grades){
	        if(grade<38){
	            res.add(grade);
	        }
	        else{
	            int q=grade/5;
	            int r=grade%5;
	            int dif=(q+1)*5-grade;
	            if(dif<3){
	                //res.add(grade);
	                res.add((q+1)*5);
	            }else{
	                res.add(grade);
	            }
	            
	        }
	    }
	    return res;

	    }
	
	public static void main(String[] args) {
		 List<Integer> res= new ArrayList<>();
		 res.add(73);
		 res.add(67);
		 res.add(38);
		 res.add(33);
		 System.out.println(gradingStudents(res).toString());
	}

}
