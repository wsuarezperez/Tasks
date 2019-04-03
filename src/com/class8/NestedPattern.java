package com.class8;

public class NestedPattern {
	    public static void main(String[] args) {
	        /*
	         * I want to print pattern ****** -> rows=4, cols=6; * * * * ******
	         * SQUARE OUTLINE
	         */

	        for (int i = 1; i <= 4; i++) {

	            for (int y = 1; y <= 6; y++) {

	                if (i == 1 || i == 4 || y == 1 || y == 6) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }

	            }
	            System.out.println();

	        }
	        for (int i=1; i<=5; i++) {
	        	for (int k=1; k<=i; k++) {
	        		System.out.print("*");
	        		
	        	}
	        	System.out.println();
	        }
	        
	        for (int i=0; i<=4; i++) {
	        	for (int y=4; y>=i; y--) {
	        		System.out.print("*");
	        	}
	        	System.out.println();
	        }
	    }
	    
	}
