package homework;
import java.util.Scanner;
public class PracticeOrAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Task
		//Prompt the user to enter two people's heights in inches. Each person should be 
		//classified as one of the following:
		//• short (under 5 feet)
		//• medium(5 to 6 feet)
		//• tall (6 feet and over)
		double height;
		Scanner myScan;
		myScan=new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        height=myScan.nextInt();
        
        if (height<=60) {
        	System.out.println("You are a short height");
        }else if (height>60 && height<=72) {
        		System.out.println("You are medium height");
        	}if (height>72) {
        		System.out.println("You are a tall height");
        		
        	}
        }
        	}


