package com.class8;
import java.util.Scanner;
public class NestedLoopAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. Write a program that reads a range of integers (start and end point), 
		 * provided by a user and then from that range prints the 
		 * sum of the even and odd integers.
		 */
		Scanner scan=new Scanner(System.in);
		int start, finish, sumOdd=0, sumEven=0;
		
		System.out.println("Please enter the start point of the range");
		start=scan.nextInt();
		System.out.println("Please enter the end point");
		finish=scan.nextInt();
		
		for (int i=start; i<=finish; i++) {
			if (i%2==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
				
			}
			}
		System.out.println("The sum of odd numbers in your range "+start+ "to "+finish+ "is " +sumOdd);
		System.out.println("The sum of even numbers in your range " +start+ "to "+finish+ "is " +sumEven);
//------------------------------------------------------------------------------//
		/* 2. Ask user to enter the item they want to buy and  the price for the item. 
		 * Then ask user to pay for it. Every time user enters money accumulate 
		 * the amount and tell user how much is left to pay off the amount. 
		 * Whenever user done with payments tell them "Thank you for shopping!"
		 */
		String item;
		double price;
		double payment;
		double totalPayment=0;
		double balance;
		Scanner input;
		
		input=new Scanner(System.in);
		System.out.println("Please enter the name of your item");
			item=input.nextLine();
		System.out.println("Please enter price");
		price=input.nextDouble();
		
		do {
			System.out.println("Enter your payment");
			payment=input.nextDouble();
			
			totalPayment=totalPayment+payment;
			balance=price-totalPayment;
			System.out.println("Please enter the following $" +balance);
			
		} while (totalPayment!=price);
			System.out.println("Thank you for shopping");
}		
		
}

