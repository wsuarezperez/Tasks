package com.class10;

public class ReverseString {
public static void main (String []args) {
	

	//interview question is can you reverse a string without revering function
	String original="Today is Java Class";
	String reverse="";
	
	char[] array=original.toCharArray();
	
	for (int i=array.length-1; i>=0; i--) {
		reverse=reverse+array[i];
	}
	System.out.println("Reversed String is: "+reverse);
	
	//2 charAt()
	String reverse1="";
	
	for(int i=original.length()-1; i>=0; i--) {
		reverse1=reverse1+original.charAt(i);
		System.out.println("Reversed String is: " +reverse1);
	}
		
	


}
}
