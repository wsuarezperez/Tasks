//Increment & decrement
package com.class7;

public class IncrementDecrement {

    public static void main(String[] args) {
        
        int x=1;
        x=x+1;
        System.out.println(x);
        
        int y=1;
        y+=1;
        System.out.println(y);

        int z=1;
        z++;
        System.out.println(z);
        
        
        int w=2;
        w++;
        System.out.println(w);
        
        int v=10;
        v--;
        System.out.println(v);
        
        int a=10;
        int b=++a;//preincrement = first increment --> assign
        
        System.out.println("Value of b is "+b);//11
        System.out.println("Value of a is "+a);//11
        
        int c=10;
        int d=c++;//postincrement= first assign --> increment
        
        System.out.println("Value of d is "+d);//10
        System.out.println("Value of c is "+c);//11
    
        int q=100;
        int e=q--;
        
        System.out.println("Value of e is "+e);//100 or 99?
        System.out.println("Value of q is "+q);//99
        
        int h=50;
        int g=--h;//first decrement --> assign
        
        System.out.println("Value of h is "+h);//49 or 50?
        System.out.println("Value of g is "+g);//49 or 50?
        
        
        //pre is when // comes first
        //post is when // comes last
        
        //C=1
        //C=D this means that C holds the original value of D
        //D=C this means that D holds the original value of C
        //C=D-- this means that C equals to the original value of D BUT D's new value is (d-1)
        //The C and D are next to the equal sign and since equations are conducted from left to right
        //then the system will read that c and has the same value of d but d now has a new value
        //that new value doesnt affect C when written (D--)
        //C=--D this means that C now equals the new value of D since the -- came first
        
        
        
    }
}