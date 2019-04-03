package com.class6;
import java.util.Scanner;
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program that prints out if it is good weather to go for any activity or not
		//* If the temperature is between 40 degrees and 80 degrees inclusive & no rain--> we will go for hiking
		//* otherwise--> we will not go hiking
		//* If temperature is between 25 and 40 inclusive & snowing -->going snowboarding otherwise
		//* we are not going snowboarding
		//* it if temperature is more than 80 & sunny--> go to the beach
		//* otherwise --> not go to the beac
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the temperature?");
		int temp=scan.nextInt();
		boolean rain, snow, sunny;
		String activity;
	
		if (temp>=40 && temp<80) {
				System.out.println("Is it raining?");
				rain=scan.nextBoolean();		
				{	
			}if (rain) {
				activity="lets stay home";
			}else {
				activity="lets go hiking";
				}
			
		if  (temp>=25 && temp<40) {
				System.out.println("Is it snowing?");
				snow=scan.nextBoolean();
				
			}if (snow) {
				activity="lets go snowboarding";
			}else {
				activity="lets snuggle";
				
		if (temp>80) {
			System.out.println("Is it sunny?");
			sunny=scan.nextBoolean();
			
			}if (sunny) {
				activity="lets go to the beach";
			}else {
				activity= "lets stay home";
			
			}else {
			System.out.println("Please enter a different temperature");
			activity= "unknown";
			
		}
		}
	}

		
		
		
		
		
		//CHECK WITH THIS MASTER COPY
		package com.class6;

		import java.util.Scanner;

		public class Task1 {
		    /*
		     * Write a program that prints out if it is good weather to go for any activity
		     * or not
		     *
		     * If the temperature is between 40 degrees and 80 degrees inclusive & no
		     * rain--> we will go for hiking otherwise--> we will not go hiking If
		     * temperature is between 25 and 40 inclusive & snowing -->going snowboarding
		     * otherwise we are not going snowboarding it if temperature is more than 80 &
		     * sunny--> go to the beach otherwise --> not go to the beach
		     */
		    public static void main(String[] args) {

		        Scanner scan;
		        boolean snow, rain, sunny;
		        int temp;
		        String activity;

		        scan = new Scanner(System.in);

		        System.out.println("Please enter a temperature");

		        temp = scan.nextInt();

		        if (temp >= 40 && temp < 80) {
		            System.out.println("Is it raining?");
		            rain = scan.nextBoolean();

		            if (rain) {
		                activity = "Watch a movie";
		            } else {
		                activity = "Go hiking";
		            }
		        } else if (temp >= 25 && temp < 40) {
		            System.out.println("Is it snowing?");
		            snow = scan.nextBoolean();
		            if (snow) {
		                activity = "Snowboarding";
		            } else {
		                activity = "Let's code";
		            }
		        } else if (temp >= 80) {
		            System.out.println("Is it sunny");
		            sunny = scan.nextBoolean();
		            if (sunny) {
		                activity = "Go to the beach";
		            } else {
		                activity = "Do more coding";
		            }
		        } else {
		            System.out.println("Please enter different temperature");
		            activity = "Uknown";
		        }
		        
		        System.out.println("My activity for today is " + activity);
		    }
		}