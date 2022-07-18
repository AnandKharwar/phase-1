package com.simplilearn.code;

public class nastedloop {

	
	public static void main(String[] args) {
		
		//use scanner class to take input from user
		
		int a,b,c;
		a=36;
		b=46;
		c=23;
		
		//if within if
		
		if(a==36) {
			
			if(b==46) 
			    {
					if(c==23) {
						System.out.println("If within if working");
					}
				
				}
		}
		else {
			System.out.println("error in program");
		}
		
	}

}


