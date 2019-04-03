package homework;
	public class WhilePractice {
		public static void main (String [] args) {
	
			boolean workDay=true;
			int day=1;
			
			while (workDay) {
				System.out.println("I need a day off");
				day++;
				
				if (day==7) {
					System.out.println("I do not need a day off");
					workDay= false;
				}
				day++;
				
				
				
			}
		
		}
	
	}
	


	
	/*create a boolean variable workDay and assign true
    * create int variable day and assign it to 1
    * as long as it is workDay print--> "I need a day off" and increment day
    * day once day is 6 --> your condition for your loop should become false
	*/