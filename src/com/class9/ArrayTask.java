package com.class9;

public class ArrayTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*1.Create an array of chars and store grades into it: A,B,C,D,E,F. 
 * Then print a grade B (use 2 different ways of creating an array).
 *2.Create an array of names and store all names of your group. 
 *Then print your name from that array. (use 2 different ways of creating an array).
 *3.Create an array of words: Java, Saturday, day, coding, is. 
 *Print the following sentence using element of array: “Saturday is Java coding Day”.
*/
		
		char[] grades= {'a', 'b', 'c', 'd', 'e', 'f'};
		System.out.println(grades[1]);
		
		
		//----------------------------------------------//
		
		String[] names= {"wil", "travis", "vital", "scott"};
		System.out.println(names[0]);
		
		//--------------------------------------------//
		
		String[] words= {"Java", "Saturday", "day", "coding", "is"};
		String sentence= words[1]+" " +words[4]+ " "+words[0]+" " +words[3]+ " " +words[2];
		System.out.println(sentence);
		
		
		//----------------------------------------------------//
		
		System.out.println("the size of the array is " +names.length);
		System.out.println("the size of second array is " +words.length);
	}

}
