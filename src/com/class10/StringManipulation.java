package com.class10;

public class StringManipulation {
public static void main (String [] args) {
	//1 replace()
	
	String str="I am a good tester!";
	String newStr=str.replace("a", "e");
	//im looking at every character thats *a* and 
	//will replace *a* with new character *e*
	System.out.println(newStr);
	
	String newStr1=str.replace("good", "great");
	System.out.println(newStr1);
	
	String newStr2=str.replace("tester", "programmer");
	System.out.println(newStr2);
	
	//first we look for what to replace then we type the new input
	
	String newStr3=str.replace("!" , "?");
	System.out.println(newStr3);
	
	String newStr4=str.replace("o", "0");
	System.out.println(newStr4);
	
	//2 get rid of all numbers
	String str1="12Hello 33234 World 456 %^%";
	String replacedNoNumbers=str1.replaceAll("[0-9]", "");
	System.out.println(replacedNoNumbers);
	
	String replacedNoCharacter=replacedNoNumbers.replaceAll("[a-z]", "");
	System.out.println(replacedNoCharacter);
	
	//if you want to get rid of all caps and all lower case letters type ("A-Za-z]", "")
	
	//to get rid of eveything that is NOT a letter then you will write
	//("[^A-Za-z]", "")
	//the ^^^ means EVERYTHING THAT IS NOT(w.e is in front of it)
	
	String test="This 234 Is how#y%^&# THE   STRING  Will Lo000ok";
	String replaceItAll=test.replaceAll("[^A-Za-z]", "");
	System.out.println(test);
	System.out.println(replaceItAll);
	/* [A-Z] all CAPS letters
	 * [a-z] all NON CAPS letters
	 * [0-9] all numbers
	 * [^abc] all EXCEPT whats next
	 */



}
}
