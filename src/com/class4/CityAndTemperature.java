package com.class4;

import java.util.Scanner;

public class CityAndTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cityName;
		int temp;
		
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Please enter your city");
		
		cityName=myScanner.nextLine();
		
		System.out.println("Please enter temperature in Farenheight");
		temp=myScanner.nextInt();
		//formula is (F-32)*5/9
		
		int convertedTemp=(temp-32)*5/9;
		
		int sameTemp=(convertedTemp*9/5) + 32;
		
		System.out.println("The temperature in the city " +cityName+ " is " +convertedTemp+ " degrees Celcius and " +sameTemp+ " degrees Farenheight.");
		
	
	}

}
