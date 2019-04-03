package com.class15;

public class Phone {

	boolean own;
	String brand;
	int year;
	
	public static void main(String[] args) {
		Phone cell1=new Phone();
		cell1.brand="Nokia";
		cell1.own=false;
		cell1.year=1985;
		System.out.println("I have " +cell1.own+ "owned a " +cell1.brand+ " in the year "  +cell1.year+ ".");
		Phone cell2=new Phone();
		cell2.brand="Android";
		cell2.own=true;
		cell2.year=1995;
		
		Phone cell3=new Phone();
		cell3.brand="iPhone";
		cell3.own=false;
		cell3.year=2005;
		
		cell3.searchOnline();
		cell3.useFacetime();
		
	}
	void searchOnline() {
		System.out.println("On the iPhone i can search online");
	}
	void useFacetime() {
		System.out.println("On the iPhone i can use Facetime");
	}
	
}
