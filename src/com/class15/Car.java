package com.class15;

public class Car {

	
	String make, model, color;
	int door, wheels;
	
	public static void main(String[] args) {
		
		//CLassName variableName=new ClassName();
		//1st object
		Car car1=new Car();
		car1.make="Honda";
		car1.model="Civic";
		car1.color="Black";
		car1.door=4;
		car1.wheels=4;
		
		//Car honda has 4 wheels<<---- PRINT
		//syso("Car "+car1.make+ "has " +car1.wheels+ "wheels.");
		System.out.println("Car "+car1.make+ " has " +car1.wheels+ " wheels.");
		//define behavior
		car1.drive();
		car1.reverse();
		car1.stop();
		System.out.println("-------------FOR OUR SECOND OBJECT/ CAR:-----------------");
		//2nd object
		Car car2= new Car();
		car2.make="Tesla";
		car2.model="X";
		car2.color="Blue";
		car2.door=4;
		car2.wheels=4;
		//my car is blue tesla
		System.out.println("i own a " +car2.color+ " " +car2.make+ " " +car2.model);
		car2.drive();
		car2.reverse();
		car2.stop();
	}
	//stepping outside of the main method to make your own new method
	//void-the name you want in lower case- () {}
	//THIS WILL ONLY PRINT IF IT IS TRUE. WE WILL NEED TO 
	//MAKE THE BEHAVIOR TRUE BY DOING LINE 24-26
	
	
	void drive() {
		System.out.println("my car can drive");
	}
	
	void reverse () {
		System.out.println("my car can go in reverse");
	}
	void stop () {
		System.out.println("my car is able to stop");
	}
	
	
}
