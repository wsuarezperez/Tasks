package eclipse;

public class FourtyNine {
/*Write a program that prints the string "Hey, it is year: " and the years between 2011 and 2019.

Must include year 2019 in the output 

output:
Hey, it is year:
2011
Hey, it is year:
2012
Hey, it is year:
2013
Hey, it is year:
2014
Hey, it is year:
2015
Hey, it is year:
2016
Hey, it is year:
2017
Hey, it is year:
2018
Hey, it is year:
2019
*/
	public static void main(String[] args) {
		int y=2011;
		for (int i=2011; i<2020; i++) {
			System.out.println("Hey, it is year: "+i);
		}
	}
}
