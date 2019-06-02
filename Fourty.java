package eclipse;

public class Fourty {
	/*
	 * Print 1 to 10 Numbers except 7 ,8,9,5 using the While loop
	 * 
	 * Step 1: Initialize the i value as int i=1
	 * 
	 * Step 2: Create the while loop to check the condition
	 * 
	 * Step 3: Write the if condition for validation part
	 * 
	 * Step 4 : It should print 1 2 3 4 6 10
	 */
	public static void main(String[] args) {

		// THIS IS THE ANSWER USING A FORLOOP
		for (int i = 1; i <= 10; i++) {
			if (i == 5 || i == 7 || i == 8 || i == 9) {
				continue;
			}
			System.out.println(i);
		}

		// THIS IS THE ANSWER USING A WHILELOOP
		System.out.println("-------------------------------------------------------------------");
		int i = 1;
			while (i <= 10){
			if ((i != 5) && (i != 7)&&(i!=8)&&(i!=9)){
			System.out.println(i);
			}
			i++;
			}
		System.out.println("-------------------------------------------------------------------");

		int k=0;
	    while(i<=9) {    
	        i++;
	    if (i !=7 & i !=5 & i !=8 & i!=9) {
	        System.out.println(i);
	        
	        }
	    
	    }
	}

}