package com.class9;
	public class ForEachLoop {

	    public static void main(String[] args) {
	        
	        int[] numbers= {12,13,14,15,16,17};
	        
	        for(int monkey:numbers) {
	            System.out.print(monkey+" ");
	        }

	        
	        
	        //___________________________________________________________//
	        
	            /*Create an array of countries. While retrieving all values from an array print
	             * capital for each country.*/
	                String[] array = { "USA", "Russia", "Turkey", "Spain" };
	                for (int i = 0; i < array.length; i++) {
	                    if (array[i].equals("USA")) {
	                        System.out.println("Washington DC");
	                    } else if (array[i].equals("Russia")) {
	                        System.out.println("Moscow");
	                    } else if (array[i].equals("Turkey")) {
	                        System.out.println("Ankara");
	                    } else if (array[i].equals("Spain")) {
	                        System.out.println("Madrid");
	                    }
	                }
	                String[] contries = { "USA", "Afghanistan", "Kazakhstan", "Ukraine" };
	                for (String country : contries) {
	                    switch (country) {
	                    case "USA":
	                        System.out.println("Washington DC");
	                        break;
	                    case "Afghanistan":
	                        System.out.println("Kabul");
	                        break;
	                    case "Kazakhstan":
	                        System.out.println("Astana");
	                        break;
	                    case "Ukraine":
	                        System.out.println("Kiev");
	                        break;
	                    }
	                }
	    }
	}