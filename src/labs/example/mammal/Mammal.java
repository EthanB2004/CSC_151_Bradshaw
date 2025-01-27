//Author: Ethan Bradshaw
//Date: January 27th 2024
//Purpose: to make a mammal 

package labs.example.mammal;


//Set up the class
public class Mammal{

    //Making and protecting the variables
    protected String HairColor;
    protected String EyeColor;
    protected Double BodyTemp;
    protected String Age;
    protected String Weight;
    protected String HairLength;
    
    

    //Set up the constructors
    public void Run(){
        System.out.println("Mammal is Running");
    }
    public void eat(){
        System.out.println("Mammal is eating");
    }
    public void sleep(){
        System.out.println("Mammal is now Sleeping");
    }
    public void Scratch(){
        System.out.println("Mammal is going to Scratch");
    }
    public void Walk(){
        System.out.println("Mammal is going for a Walk");

    }
    public void size(){

    }
    public void drink(){
        System.out.println("Mammal is taking a drink break");
    }
    public void sit(){
        System.out.println("Mammal is Sitting for a little bit");

    }
    public void jump(){
        System.out.println("Mammal is going to jump");
    }
    
}