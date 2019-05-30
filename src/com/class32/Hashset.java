package com.class32;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	public static void main(String[] args) {
		HashSet<Integer> hset = new HashSet<>();
		hset.add(12);
		hset.add(32);
		hset.add(34);

		System.out.println(hset.size()); // 3
		// set does not keep the order
		System.out.println(hset); // 32, 34, 12
		System.out.println(hset.contains(32)); // boolean true

		// set interface does not allow duplicates
		hset.add(12);
		hset.add(32);
		System.out.println(hset.size()); // 3

		// to retrieve all values from hashset
		// 1. using advanced for loop
		System.out.println("------------using for loop-------------");
		for (int num : hset) {
			System.out.println(num);
		}
//2.	using iterator
		System.out.println("-------------using iterator------------");
		Iterator<Integer> iterator=hset.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}
}
