package com.class4;

import java.util.Scanner;

public class DriversLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;
		
		Scanner newLicense=new Scanner(System.in);
		System.out.println("How old are you? ");
		
		age=newLicense.nextInt();
		
		if(age<18) {
			System.out.println("Sorry, you are too young. Please get a Permit instead. ");
		}else {
			System.out.println("You are eligible. Please click next. ");
		}
		
	}

}
