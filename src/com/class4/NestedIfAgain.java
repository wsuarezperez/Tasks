package com.class4;

public class NestedIfAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//declare variable for gpa and having diploma
		//if user has diploma--->congratulations
		//if gpa higher than 3.5 the hire them 
		//else do not hire
		
		double gpa=3.6;
		double expectedGpa=3.5;
		
		boolean hasDiploma=true;
		if (hasDiploma) {
			System.out.println("Congratulations!");
		if (gpa>expectedGpa) {
			System.out.println("You are hired");
		}else {
		System.out.println("Unfortunatley we cannot hire you.");
		}
		}else {
			System.out.println("Please get your degree.");
		}
				
		
	}

}
