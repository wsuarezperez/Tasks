package com.class6;

public class NotOperator {

    public static void main(String[] args) {
        /*
         *  not operator !
         */

        boolean a=!true;
        
        //System.out.println("The value of boolean variable is "+a);
        
        boolean snow=true;
        
        //if it is not snowing --> I will come to the class otherwise I will stay at home
        
        
        if (!snow) {
            System.out.println("I will come to the class");
        }
        
        int x=10;
        int y=20;
        
        if (!(x>y)) {
            System.out.println("Hello");
        }
        
        
        
    }
}



										//Logical AND &&

//TRUE AND TRUE = TRUE
//TRUE AND FALSE = FALSE
//FALSE AND TRUE = FALSE
//FALSE AND FALSE = FALSE

										//Logical OR ||

//TRUE OR TRUE = TRUE
//TRUE OR FALSE= TRUE
//FALSE OR TRUE = TRUE
//FALSE OR FALSE=FALSE

										//Logical NOT !

//true --> false
//false-->true


