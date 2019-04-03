package com.class9;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int num;
		        
		        num=10; //int num=10;
		        
		        int[] array1;//declare an array --> preferred way
		        int [] array2;//declare an array
		        int array3[]; //declare an array
		        
		        array1=new int[4];//initialize, create an array
		        
		        //assigning value
		        array1[0]=10;
		        array1[1]=20;
		        array1[2]=30;
		        array1[3]=40;
		        
		        //access values
		        System.out.println(array1[0]);
		        
		        int[] numbers=new int[3];
		        
		        numbers[0]=5;
		        numbers[1]=10;
		        numbers[2]=15;
		        //numbers[3]=20; no error during compilation but error during run time
		        //System.out.println(numbers[3]);//ArrayIndexOutOfBoundsException
		        
		        System.out.println(numbers[2]/numbers[0]);//5 15 or 20
		        
		        String[] a=new String[3];
		        a[0]="Hello";
		        a[1]="Hi";
		        a[2]="Bye";
		        
		        System.out.println(a[1]+" friends");
	/* this is the way i saw online	        
	 */
		        //the[] will make my variable an array
		       int wilberth[]=new int[10]; //<<this means that i will have 10 different
		    		   					  //values/variables in one array
		    	wilberth[0]=33;
		    	wilberth[1]=500;
		    	wilberth[9]=5;
		    	//^^if you have a total of 10 variables for one array
		    	//java will begin at 0 and your highest number will be 9
		    	// if you have a total of 11 then your highest will be 10
		    	//it will be 0-your end number
		    	
		    	System.out.println(wilberth[1]);
		    	
		    	//ANOTHER WAY IS MAKING AN ARRAY INITIALIZER
		    	
		    	int perez[]= {2,4,5,8,53};
		    	//THIS ASSIGNS YOUR ARRAY "PEREZ" TO HAVE A SUBSCRIPT TO EACH VALUE
		    	//JAVA KNOWS YOU HAVE MORE THAN ONE VARIABLE
		    	/*SO PEREZ[0]=2
		    	 * PEREZ[1]=4
		    	 * PEREZ[2]=5
		    	 * PEREZ[3]=8
		    	 * PEREZ[4]=53
		    	 */
		    	
		    	System.out.println(perez[3]);
		    	System.out.println(perez[4]);
		    	
		    }
		}
	