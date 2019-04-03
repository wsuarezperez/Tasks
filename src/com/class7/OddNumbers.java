package com.class7;

public class OddNumbers {
	    /* print only odd numbers from 1 to 20 */

	    public static void main(String[] args) {

	        int num = 1;

	        while (num <= 20) {
	            
	            System.out.println("I am inside while loop");
	                    //3%2 =1
	                if (num % 2 != 0) {
	                    System.out.println(num);
	                }
	                
	            num++;    
	            
	            int number = 1;

	            while (number <= 20 && number % 2 != 0) {
	                System.out.println(number);
	                number++;
	            
	            //print only even numbers from 10 to 100
	            int numb=2;
	            while (numb<=100) {
	            	System.out.println("These are even numbers");
	            	if (numb % 2!=0) {
	            		System.out.println(numb);
	            	}
	            	numb++;
	            	}
	            
//copied from online for even number
	           // int num =1 ;
	            
	           // while(num <=20) {
	             //   System.out.println(“im inside the loop”);
	           //     if(num %2 == 0) {
	         //           System.out.println(num);
	       //         }
	     //           num++;
	            }
	        }

	    }
	            }
	        
	    
