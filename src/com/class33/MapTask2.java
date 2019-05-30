package com.class33;

import java.util.*;

/*
Create a map of countries with its capital. 
Print all keys and values from a country map using for each loop and iterator.
*/

public class MapTask2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("New York", "Albany");
		map.put("Pennsylvania", "Harrisburg");
		map.put("Maryland", "Annapolis");

		System.out.println(map);

		Set<String> key = map.keySet();
		// for (Integer key: keys) {
		// System.out.println(key+":"+map.get(key));

		for (String keys : key) {
			System.out.println(keys + ":" + map.get(keys));
		}
		
		
		Iterator<String> keyyIt=key.iterator();
		while (keyyIt.hasNext()); {
			String keey=keyyIt.next();
		}
		
		
		while(keysIt.hasNext()) {
			Integer keey=keysIt.next();
			System.out.println(key+":"+map.get(key));
		}
	}
}