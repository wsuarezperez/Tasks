package homework;

import java.util.Scanner;

public class SwitchCaseHw {

    public static void main(String[] args) {
    	//Exercises to complete:
    		//Ask user to enter their country and capture it. 
    		//Once values are captured print which language user speaks.

//    		Allow user to enter grade and then provide explanation: A-Excellent, B-Good, 
  //  		C-Average, D-Bad, any other grade --> Not Acceptable. 
    //		At the end your program should print which grade was entered by a user with explanation.
//
   // 		HomeWork: Using scanner class create calculator. Allow user to enter 2 
  //  		numbers and operator(+,-,*,/). Based on operator provide the result t
    	

        String language, country;
        Scanner scan;
        scan=new scanner(System.in);
        System.out.println("Please enter what country you are from");
        country=scan.nextLine.in();
        
        
        if (country==philippines) {
            language="Tagalog";
        }else if (country==dominican republic) {
            language="spanish";
        }else if (country==jamaica) {
            language="broken english";
        }else if(country==china) {
            language="mandarin";
        }else {
            country="Invalid";
        }
        
        System.out.println("You speak" +language);
        
        switch (country) {
        
        case 1:
            language="Tagalog";
            break;
        case 2:
            language="spanish";
            break;
        case 3:
            language="broken english";
            break;
        case 4:
            language="mandarin";
            break;
        default:
            language="Invalid";
        }
    }
}