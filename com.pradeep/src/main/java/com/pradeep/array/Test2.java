package com.pradeep.array;

public class Test2 {
	public static String timeConversion(String s) {
	    // Write your code here
	    String [] str= s.split(":");
	    if(s.contains("AM")){
	        if(str[0].equals("12")){
	            return "00:"+str[1]+":"+str[2].replace("AM","");
	        }else{
	           return  str[0]+":"+str[1]+":"+str[2].replace("AM","");
	        }
	    }else{
	        int hour=Integer.parseInt(str[0]);
	        if(hour==12){
	            return str[0]+":"+str[1]+":"+str[2].replace("PM","");
	        }
	        else{
	            int nt=12+Integer.parseInt(str[0]);
	           return  nt+":"+str[1]+":"+str[2].replace("PM","");
	        }
	    }
	}

		public static void main(String[] args) {
			//timeConversion("07:05:45PM");
			int x=23/5;
			int y=23%5;
			System.out.println(x);
			System.out.println(y);
		}

}
