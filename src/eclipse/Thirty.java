package eclipse;

import java.util.Scanner;

public class Thirty {
	public static void main(String[] args) {

		boolean thirsty = true;
		boolean sleepy = true;

		Scanner input = new Scanner(System.in);

		System.out.println("Are you thirsty?");
		thirsty = input.nextBoolean();

		System.out.println("Are you sleepy?");
		sleepy = input.nextBoolean();

		if (thirsty && sleepy == false) {
			System.out.println("Looks like you need Water");
		} else if (thirsty && sleepy) {
			System.out.println("Looks like you need Coffee");
		} else if (thirsty == false && sleepy) {
			System.out.println("Looks like you need Tea");
		} else {
			System.out.println("Looks like you need Nothing");
		}
	}

}
