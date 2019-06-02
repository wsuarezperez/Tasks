package classesAndObjects;

public class Person {
//instance variables (data or "state")
	String name;
	int age;
	
	
	//classes can contain
	//1. data
	//2. subs routines (methods)
	
	
	public static void main(String[] args) {
	//you can "call" the class down to use it and give it purpose
		Person person1 = new Person();
		person1.name = "wil perez";
		person1.age= 27;
		
		Person person2 = new Person ();
		person2.name = "josselyn perez";
		person2.age = 28;
		
		
		System.out.println("my name is "+person1.name+ "and my age is "+person1.age+". my wifes name is " +person2.name+ "and she is " +person2.age+ "years old.");
}
}
