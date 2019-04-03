package com.class15;

public class Dog {
String breed, color, size;
int amount, age;

public static void main(String[] args) {
	Dog dog1=new Dog();
	
	dog1.breed="beagle";
	dog1.size="medium";
	dog1.color="black";
	dog1.amount=1;
	dog1.age=12;
	
	System.out.println("i have "+dog1.amount+" " +dog1.color+ " " +dog1.breed+ " that is " +dog1.size+ " size and " +dog1.age+ " years old.");

}
}
