package homework;

public class ThisIsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//check if user has credit card
		//check if balance is more than 1000>>pay off
		//else *you are good*
		boolean creditCard=true;							
		int balance=0;
		
		if (creditCard) {
			System.out.println("lets check the balance");
		if (balance>1000) {
			System.out.println("pay off now");
		}else
			 if (balance==0) {
				 System.out.println("dont come back");
			 }else {
			
			System.out.println("you are good");
		}
		}else {
			System.out.println("Do you want a credit card?");
			
		}
	}

}
