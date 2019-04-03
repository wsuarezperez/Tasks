package com.class11;

import java.util.Scanner;

public class IQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* write a java program to find whether a string is palindrome or not
 * (dad, mom, madam)
 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter any word to check if it is a palindrome!");
		String word=scan.nextLine();
		String reverse="";
		
		for (int i=word.length()-1; i>=0; i--) {
			reverse+=word.charAt(i);
		}
		System.out.println(reverse);
		
		if (word.equalsIgnoreCase(reverse)) {
			System.out.println("the word is palindrome ");
		}
		else {
			System.out.println("the word IS NOT palindrome");
		}
	}

}
