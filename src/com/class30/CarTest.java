package com.class30;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
System.out.println();
 
		Car car;
    
		car = new Sedan("blue", 25000, 3000);
		double carPrice = car.calculateSalePrice();
		System.out.println(carPrice);

		car = new Truck("blue", 25000, 3000);
		double carPrice1 = car.calculateSalePrice();
		System.out.println(carPrice1);
		
		ArrayList list= new ArrayList();
		list.add("apple");
		list.add("orange");
		 for (Object fun : list) {
			System.out.println(fun);
		}
	}
	
	
	public static void apple (String green) {
		
		System.out.println(green);
	}
public static void apple (String green, String red) {
		
		
	System.out.println(green+" "+red);

	}
}