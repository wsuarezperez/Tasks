package com.class5;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7 days a week
		//if 1-5 it is weekday
		//if 6-7 it is weekend
		//outside of 1-7 is not a valid day
		int day=7;
		if (day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("it is a weekday");
		}else if (day==6 ||day==7) {
			System.out.println("it is a weekend");
		}else 
			System.out.println("not a valid day");

//-------------------------------------------------------------------------------------
		  String Winter, Spring, Summer, Fall;
		  int month;
		  Scanner scan=new Scanner(System.in);
		  
		  System.out.println("Please enter your birthday month number");
		  month=scan.nextInt();
		  
		  if (month==12 || month==1 || month==2) {
			    System.out.println("Winter");
			  }else if 
			    (month==3 || month==4 || month==5) {
			      System.out.println("Spring");
			    }else if 
			      (month== 6 || month==7 || month==8) {
			        System.out.println("Summer");
			      }else if 
			        (month== 9 || month==10 || month==11) {
			          System.out.println("Fall");
			        }else
			        	System.out.println("Please enter valid month number season=Unknown");
	
	
	}}