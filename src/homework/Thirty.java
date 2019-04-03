package homework;

import java.util.Scanner;

public class Thirty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Take 2 boolean inputs from a user:
 
"Are you thirsty?"
"Are you sleepy?"

If user is thirsty and not sleepy--> drink=Water
If user is thirsty and sleepy--> drink=Coffee
If user is not thirsty and sleepy --> drink=Tea
Otherwise drink="Nothing"

The output should be:   "Looks like you need ___ 
*/

	boolean thirsty, sleepy;
	String yes, no;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Are you thirsty?");
	thirsty=scan.hasNextBoolean();
	System.out.println("Are you sleepy?");
	sleepy=scan.hasNextBoolean();
		if (thirsty==true && sleepy==false) {
			System.out.println("looks like you need to drink water");
		}
		if (thirsty==true && sleepy==true) {
			System.out.println("looks like you need to drink coffee");
		}
		if (thirsty==false && sleepy==true) {
			System.out.println("looks like you need to drink tea");
		}
		else {
			System.out.println("looks like you need nothing");
		}
	}

}
