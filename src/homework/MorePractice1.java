package homework;

import java.util.Scanner;

public class MorePractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3,largest;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 3 double values");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		//THIS IS NESTED
		if (num1>num2) 	{
			if (num1>num3) {
				System.out.println(num1+ " is the largest");
			}else {
				System.out.println(num3+ "is the largest");
			}
			}else { //assuming num2 is larger
				if (num2>num3) {
					System.out.println(num2+ " is the largest");
				}else {
					System.out.println(num3+ "is the largest");
			}
		}
			
	}

}
