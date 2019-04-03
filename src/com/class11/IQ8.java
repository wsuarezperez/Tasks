package com.class11;

public class IQ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*FIBONACCI the sum of 2 previous  numbers
 * 0+1=1=2=3=5=8=13=21
 * a+b=c=d=e=f=g=h=i=j
 *   a+b=c=d=e=f=h=h=i=j
 *     a+b=c=d=e=f=g=h=i=j
 */
		int a=0;
		int b=1;
		int c=0;
		
		for (int i=0; i<10; i++) {
			c=a+b;
			a=b;
			b=c;
			
			System.out.print(a+ " ");
		}
		
		
		
		
		
	}

}
