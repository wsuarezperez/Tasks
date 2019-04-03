package com.class8;

public class ForLoop {
public static void main (String []args) {
	//initialize			condition/testCondition			increment/decrement
	for (int i=1;				i<=10;						i++) {
	System.out.println("Good morning " +i);
	}
	
	//i want to print numbers from 10 to 1
	for (int h=10;				h>=1;						h--) {
		System.out.println("Good night " +h);
	}
	
	//going up by 2
	for (int k=0;				k<=20;						k+=2) {
		System.out.println(k);
	}
	/* this wont continue to print because b is 5 and the condition wants to print
	 * the numbers that are less than or equal to it, so the only number is 5 since b=5*/
	for (int b=5;					b<=5;						b++) {
		System.out.println(b);
	}r
	}
}