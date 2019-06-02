package gettersAndReturnValues;

public class Person {

	String name;
	int age;

	void speak() {
		System.out.println("my name is " + name);
	}

	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		// System.out.println(yearsLeft);

		return yearsLeft;
		/*
		 * there was previously "void calculateYearsETC" void means there will be no
		 * return within this method { } in order to change that we replace "void" with
		 * "int" something that returns an INT then type at the very
		 * bottom"return yearsLeft;" now remove the syso
		 */
	}
	// under here is the main program, everything else is outside of the main
	// program
	// hint: the word main

	public static void main(String[] args) {
		Person person1 = new Person();

		person1.name = "wil";
		person1.age = 27;

		person1.speak();

//in order to print the years left again since the syso was removed from the method above
// we need to create an int and make it print the above code
		int years = person1.calculateYearsToRetirement();
		// this code means you are making the int, years, be equal to the RETURN value
		// in the method above
		// because the years to retirement is still 65-age
		// now syso using the new int that bring the return value down, "years" since it equals the same

		System.out.println("years to retirement is " + years);
	}
}
