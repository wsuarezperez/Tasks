package com.class10;

public class StringSplit {
public static void main (String []args) {
	
	String str="welcome Syntax StudentS Batch 4";
	String[] array=str.split("S");
	System.out.println("The length of the array is "+array.length);
	for (String substring: array) {
		System.out.println(substring);
	}
	System.out.println("__________________________");
	for(int i=0; i<array.length; i++) {
		System.out.println(array[i]);
	}
	
	
	/*create a String that will hold a sentence. Write a program to get a new String 
	without any spaces.
	Create a String that should be combination of letters, numbers and special 
	characters.
	Find out how many alpha characters are there in the String.
	You have a String a=“Is it saturday! Is it raining! Do we have a Java Class today?” 
	How would you find out how many sentences are in that String?
	*/
	String map="Today is Java day and this is confusing";
	String newmap=map.replace(" ", "");
	System.out.println(newmap);
	
	String two="happy 1234 sad ^&*(";
	String letter=two.replaceAll("[^A-Za-z]", "");
	System.out.println(letter);
	System.out.println(letter.length());
	
	String apple="Is it saturday? Is it raining? Do we have a Java Class today?";
			String[] arrays=apple.split("\\?");
			
			for (String substring:array) {
				System.out.println(substring);
			System.out.println();
			System.out.println("there are "+array.length+ "sentences in this array");
			
			}
	
	
}
}