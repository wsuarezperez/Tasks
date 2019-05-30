package eclipse;

import java.util.Scanner;

public class ThirtyOne {
	// write code below
	public static void main(String[] args) {

		String name;
		String assignment;

		System.out.println("enter name of the instructor");

		Scanner input = new Scanner(System.in);
		name = input.nextLine();

		switch (name) {
		case "Shiva":
			System.out.println("Will take care of Java Assignment");
			break;

		case "Sandish":
			System.out.println("Will take care of SDLC Assignment");
			break;

		case "Weqas":
			System.out.println("Will take care of Selenium Assignment");
			break;

		case "Asel":
			System.out.println("Will take care of every Assignment");
			break;

		default:
			System.out.println("Invalid instructor selected");
		}
	}
}