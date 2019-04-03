package com.class6;
import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program that prints out if it is good weather to go for any activity or not
		//* If the temperature is between 40 degrees and 80 degrees inclusive & no rain--> we will go for hiking
		//* otherwise--> we will not go hiking
		//* If temperature is between 25 and 40 inclusive & snowing -->going snowboarding otherwise
		//* we are not going snowboarding
		//* it if temperature is more than 80 & sunny--> go to the beach
		//* otherwise --> not go to the beac
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the temperature?");
		int temp=scan.nextInt();
		boolean rain=false;
		boolean snow=true;
		boolean sunny=true;
		
		if (temp>=40 && temp<80) {
			if (rain) {
				System.out.println("Lets go hiking");
		}else {
			System.out.println("Lets stay home and do coding");
		}
	}
			else if  (temp>=25 && temp<40) {
			if (snow=true) {
				System.out.println("Lets go snow boarding");
		} else {
			System.out.println("Lets stay home and do some coding");
		}
			}
		else if (temp>80) {
			if (sunny=true)
			System.out.println("Lets go to the beach!");
		}
	}
}
