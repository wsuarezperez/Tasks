package homework;

import java.util.Scanner;

public class PracticeOrAnd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Task 2
			//Write a program that will read three inputs of scores (quiz, mid term, and final scores) 
			//and determine the grade based on the following rules:
			//if the average score >=90 =>grade=A
			//if the average score >= 70 and <90 => grade=B
			//if the average score>=50 and <70 =>grade=C
			//if the average score<50 =>grade=F

			Scanner test;
			int quiz;
			int midTerm;
			int finag;
			
			test=new Scanner(System.in);
			System.out.println("Enter your quiz grade");
			quiz = test.nextInt();
			
			System.out.println("Enter your midTerm grade");
			midTerm=test.nextInt();
			
			System.out.println("Enter your finag grade");
			finag=test.nextInt();
			
			int average=(quiz+ midTerm+ finag)/3;
			
			if (average>=90) {
				System.out.println("your average grade is A");
			}else if (average >=70 && average<90) {
				System.out.println("your average grade is B");
			}else if (average >=50 && average <70) {
				System.out.println("your average grade is C");
			}else if (average<50) {
					System.out.println("your average grade is F");
				}
			}
			
			
					
	
}
