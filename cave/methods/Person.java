
//CREATING A SUBROUTINE TO MAKE THIS PERSON GIVE US THEIR NAME

package methods;
class robot {
	// METHOD AND PARAMETER
	public void talk() {
		System.out.println("the robot will speak on here");

		System.out.println("------------------------------------------------------------------------------------------");
	}
	public void jump() {
		System.out.println("the robot will jump in this one");
		
	}
	public void move() {
		System.out.println("the robot will move in this one");
	}
}










public class Person {

	
	//instance variable
	String name;
	int age;

	// subroutine

	void speak() {
		System.out.println("Hello");
		// you can also make a sentence bringing your intance variables
		System.out.println("my name is " + name + " and i am " + age + " years old");
// you can put as many codes as you want in here like a ForLoop
	for (int i=0; i<3; i++) {
		System.out.println("print this 3x");
	}
	}
	
	//making a new sub routine
	//you can make this subroutine but nothing will happen unless its called
	
	void speakAgain() {
		System.out.println("i am printing so only 1 person speaks this sentence");
	}
//^^in order to run this code you need to call it by bringing it down
// to person1 or whichever person you want

	public static void main(String[] args) {
		// you can "call" the class down to use it and give it purpose
		Person person1 = new Person();
		person1.name = "wil perez";
		person1.age = 27;
		// THIS IS HOW YOU CALL IT DOWN
		person1.speak();

		Person person2 = new Person();
		person2.name = "josselyn perez";
		person2.age = 28;
		person2.speak();
		person2.speakAgain();
		System.out.println("my name is " + person1.name + "and my age is " + person1.age + ". my wifes name is "
				+ person2.name + "and she is " + person2.age + "years old.");
		
		
		
	}
}
