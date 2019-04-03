package com.class8;

public class ForLoopAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /* print numbers from 1 to 100*/
		
	for (int a=1;			a<=100;					a++) {
	System.out.println(a);
	}
	// print numbers from 100 to 1
	
	for (int b=100;			b>=1;					b--) {
		System.out.println(b);
	}
	 
	//print odd numbers from 1 to 20 BOTH ways
	
	for (int c=1;			c<=20;					c+=2) {
		System.out.println(c);
	}
	//second way
	for (int d=19;			d>=1;					d-=2) {
		System.out.println(d);
	}
	
	//print even numbers between 20 and 50
	for (int e=20; 			e<=50;					e+=2) {
		System.out.println(e);
	}
	
	//print odd numbers between 20 and 50 going down
	for (int f=49;			f>=20;					f-=2) {
		System.out.println(f);
	}
	
	}

}
