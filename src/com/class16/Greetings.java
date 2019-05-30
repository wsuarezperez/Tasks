package com.class16;

public class Greetings {
public static void main(String[] args) {
	Greetings obj = new Greetings();
	obj.hello();
	//how to find largest number
obj.findLargest();
}

void hello () {
	System.out.println("Hello");
}
void findLargest() {
	int a=10;
	int b=20;
	if (a>b) {
		System.out.println("a is larger than b");
	}else {
		System.out.println("b is larger than a");
	}
	
	
}
}
