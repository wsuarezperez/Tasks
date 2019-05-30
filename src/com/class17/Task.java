package com.class17;

public class Task {
	
public static void main(String[] args) {
	//creating a method createEmail(). 
	//user provides name, last nme, email
	//method returns complete email address

Task obj=new Task();
String email=obj.createEmail("John", "Snow", "gmail");
System.out.println(email);

}

//return type methodName

String createEmail(String name, String lastName, String emailType) {

String email= name+ lastName+ "@" +emailType+ ".com";
return email.toLowerCase();
}

}