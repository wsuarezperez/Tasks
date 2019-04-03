package com.class10;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//task 5
		//write a java program to reverse string, reverse a string word by word
		String original="We Are Team JavaJets!";
		String reverse="";
		
		char[] array=original.toCharArray();
		
		for (int i=array.length-1; i>=0; i--) {
			reverse=reverse+array[i];
		}
		System.out.println("Reversed String is: "+reverse);

			/*how to find out the part of the string from a string ?
			what is substring
			find number of words in a string
			*/
	
		
		
	}

}
