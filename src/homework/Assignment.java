package homework;
import java.util.Scanner;
public class Assignment {
public static void main (String [] args) {

	double price;
	Scanner scan=new Scanner(System.in);
	System.out.println("Insert correct amount of money");
	price=scan.nextDouble();
	
	while (price !=1.99) {
		System.out.println("Pay for your soda");
		price=scan.nextDouble();
	} 
	
	System.out.println("Enjoy your soda");
	}
	
	
	
	/*ask user to pay for a soda
	keep asking user to pay for soda until entered price is not equal to 1.99
	after user got a right amount print "Please enjoy your soda"*/
}
