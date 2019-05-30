
package com.class31;
import java.util.*;
//1.Create an arraylist of cars and retrieve 
//all the values using 4 different ways.

public class Task {

	public static void main(String[] args) {
		String [] test= {"honda", "chevy", "toyota"};
		List<String> list = new ArrayList <String>();

		//add array of items to list
		for (String x: test)
			list.add(x);
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
