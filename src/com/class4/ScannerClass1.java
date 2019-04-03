package com.class4;

import java.util.Scanner;

public class ScannerClass1 {

	public static void main(String[] args) {
		
		//ask user for Name and print good morning
		Scanner input= new Scanner(System.in);
		System.out.println("Learning scanner");
		
		String name=input.nextLine();
		
		System.out.println("Good morning" +name);
		
		
	}
}
