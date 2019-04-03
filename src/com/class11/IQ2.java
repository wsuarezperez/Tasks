package com.class11;

public class IQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*write a java program to find the second largest number in the array
		maximum and minimum number in the array*/
	int arr[]= {144, 46, 0, 86, 292, -1};
	
	int min= arr[0];
	int secondlargest =0;
	int largest = 0;
	
	for (int a:arr) {
		if (a>largest) {
			largest=a;
		}
		if (a<min) {
			min = a;
		}
	}
	for (int a:arr) {
		if (a> secondlargest && a<largest) {
			secondlargest = a;
	        }
	        System.out.println(“min = ” + min);
	        System.out.println(“Second Largest = ” + secondLargest);

	        System.out.println(“Largest = ” + largest);
			
			
		}
	}
	
	
	}