package com.class17;

public class Student {

/* create class student that will have a method getGrade
 * your method should accept the score of a student and return grade
 * score> 90 A
 * >80 B
 * >70 C
 * > 50 D
 * anything else F
 */
	
	public static void main(String[] args) {
	Student obj= new Student ();
	char myGrade= obj.getGrade (91);

	
	}
char getGrade(int score) {
	char grade;
	
	if (score> 90) {
		grade = 'A';
	}else if (score> 80) {
		grade = 'B';
	}else if (score> 70) {
		grade = 'C';
	}else if (score> 60) {
		grade = 'D';
	}else {
		grade = 'F';
	}
	return grade;
}
}
