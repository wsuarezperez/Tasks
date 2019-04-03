package com.class11;

public class IQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* write a java program to reverse string
 * reverse string word by word
 */
		String sentence="the master is speaking";
		String reverse="";
		
		for (int i=sentence.length()-1; i>=0; i--) {
			reverse=reverse+sentence.charAt(i);
		}
		System.out.println(sentence);
		System.out.println(reverse);
		
		
		//REVERSE AS AN ARRAY
		String[] words=reverse.split(" ");
		for (int i=words.length-1; i>0; i--) {
			System.out.print(words[i] + " ");
		}
		
	}

}
