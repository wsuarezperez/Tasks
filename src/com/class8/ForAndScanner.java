package com.class8;

import java.util.Scanner;

public class ForAndScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// prompt user to enter 2 integers and comparre them
		// at the end print the largest
		Scanner myScanner;
		int num1, num2;
		int largest=0;
		myScanner = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		num1 = myScanner.nextInt();
		num2 = myScanner.nextInt();

		for (int i = 1; i <= 5; i++) {

			if (num1 > num2) {
				largest = num1;
			} else if (num2 > num1) {
				largest = num2;
			} else {
				System.out.println(num1 + "equals to " + num2);
			}
			System.out.println(largest + "is the Largest number");

		}
	}
}
