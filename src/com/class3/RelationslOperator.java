package com.class3;

public class RelationslOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=19;
		int b=55;
		
		boolean result= a>b;
		boolean result1= a==b;
		
		System.out.println(result);
		System.out.println(result1);
		
		//compare 2 numbers and if a is larger than b---> print
		if (a>b) {
			System.out.println("Hello");
		} 	else {
			System.out.println("Bye");
		}
		//declare price and if price is higher than expected price, I will not buy
		
		double shoesPrice= 99.99;
		double allowedPrice= 31.99;
		
		if (shoesPrice<=allowedPrice) {
			System.out.println("I am buying the shoes");
		}	else {
			System.out.println("I am NOT buying the shoes");
		}
		
	}

}
