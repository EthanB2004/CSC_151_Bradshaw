//Author: Ethan Bradshaw
//Date: January 29th 2024
//Purpose: to make a Dog 

package labs.example.mammal;


public class Dog extends Mammal {
    

    public void bark(){
        System.out.println("woof....wooof....woof");
    }

    public void fetch(){
        run();
    }

    public void hunt(){
        Walk();
        System.out.println("The calculated angle is: " +String.format("%.2f",mammal.Walk()) + " degrees.");

    }
    public void sniff(){
    
    }
}