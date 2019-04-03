package com.class5;

public class LogicalAndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
						//LOGICAL "AND"
		//TRUE AND TRUE = TRUE
		//TRUE AND FALSE = FALSE
		//FALSE AND TRUE = FALSE
		//FASLE AND FALSE = FALSE
		
						//LOGICAL "OR"
		//TRUE OR TRUE = TRUE
		//TRUE OR FALSE = TRUE
		//FALSE OR TRUE = TRUE
		//FALSE OR FALSE = FALSE
		
		// TASK 
		//if number is between 1-10 >> number is small
		//if number is between 11-100>> number is medium
		//if number is 101-1000>> number is large

		int num=15;
		//true and false= false
		if (num>=1 && num<=10) {
			System.out.println("number is small");
			//true and true
		}else if (num>=11 && num<=100) {
			System.out.println("number is medium");
			//false and true
		}else if (num>=101 && num<=1000) {
			System.out.println("number is large");
			//false
		}else 
			System.out.println("number is out of range");
		}
	}


