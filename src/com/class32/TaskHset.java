package com.class32;

import java.util.HashSet;
import java.util.Iterator;

public class TaskHset {
public static void main(String[] args) {
	HashSet<String> hset = new HashSet<>();
	hset.add("Brooklyn");
	hset.add("Los Angeles");
	hset.add("Waldorf");
	
	System.out.println(hset);
	
	System.out.println("------------using for loop-------------");

	for (String city: hset) {
		System.out.println(city);
	}
	
	
	System.out.println("-------------using iterator------------");
	Iterator<String> cities = hset.iterator();
	while (cities.hasNext()); {
		System.out.println(cities.next());
	}
	

	
}
}
