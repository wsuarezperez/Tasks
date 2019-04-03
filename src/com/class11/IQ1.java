package com.class11;

public class IQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*write a program to swap 2 numbers without temporary variable
 * swap 2 strings without a temporary variable
 */
		//PART OF A STRING IS CALLED SUBSTRING
		
		int a=10;
		int b=20;

a=a+b;//30
b=a-b;//30-20=10
a=a-b;//30-10=20
System.out.println("the value of a="+a+" value of b="+b);


String str1="Hello";
String str2="World";

str1=str1+str2; //HelloWorld (10 letters)
str2=str1.substring(0, str1.length()-str2.length()); //Hello
str1=str1.substring(str2.length());

System.out.println("the value of str1="+str1+"the value of str2="+str2);


str1=str1+str2;
str2=str1.replaceAll(str2,"");
str1=str1.replaceAll(str2, "");
System.out.println(str1);
System.out.println(str2);


	}

}
