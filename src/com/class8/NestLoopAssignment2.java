package com.class8;

public class NestLoopAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*print the following pattern
		1
		12
		123
		1234
		12345
		*/
		
		for (int i=0; i<=5; i++) {
			for (int k=1; k<=i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
				
	}

}


