package com.class4;

import java.util.Scanner;

public class LoanAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int loanMoney;
	

		Scanner newLoan=new Scanner(System.in);
		System.out.println("How much money do you need? ");
		
		loanMoney=newLoan.nextInt();
		
		if(loanMoney<200000) {
		System.out.println("Approved"); 
		}else {
			System.out.println("Rejected");
		}
		
	}

}
