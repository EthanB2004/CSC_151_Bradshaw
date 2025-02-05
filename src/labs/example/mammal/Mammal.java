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
    protected String name;
    protected String HairLength;
    Int miles;
    
    

    //Set up the constructors
    public void Run(){
        System.out.println("Mammal is Running");
    }
    public void eat(){
        System.out.println("The " + this.name + " is eating");
    }
    public void sleep(){
        System.out.println("The" + this.name + "is now Sleeping");
    }
    public void Scratch(){
        System.out.println("The" + this.name + " is going to Scratch");
    }
    public Walk(int miles){
        int south = 3;
        int east = 3;
        int miles = 0;
        double angle = 0;
        System.out.println("The" + this.name + " is going for a Walk It is headed South"); //Dog be walking
        Thread.sleep(3000);
        System.out.println("The " +this.name+ " is now headed east, after walking 3 miles.");
        Thread.sleep(4000);
        System.out.println("The " +this.name+ " is now coming back, after walking 4 miles");
        ///Doing the maths 

        miles = Math.pow(3,2) + Math.pow(4,2);
        miles = Math.sqrt(miles);
        angle = Math.atan2(3,4);
        System.out.println("The "+this.name+ " is now home after walking " +miles+ "At an angle of " +angle+ "degrees");



    }
    public void size(){

    }
    public void drink(){
        System.out.println("The" + this.name + " is taking a drink break");
    }
    public void stand(){
        System.out.println("The" + this.name + " is now standing");
    }
     public void bark(){
        System.out.println("woof....wooof....woof");
    }
    public void sit(){
        System.out.println("The " + this.name + " Is sitting down");

        try
        {
            Thread.sleep(15000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

        System.out.println("The" + this.name + " is now getting up from their sit");
        
        stand();
        bark();
    } 
    public void jump(){
        System.out.println("The" + this.name + " is going to jump");
    }
    public void setName(String name) {
        this.name = name;
    }    

    public void getMammalDetails(){
        System.out.println("Hair color "  + this.HairColor);
        System.out.println("Eye Color " + this.EyeColor);
        System.out.println("Body Temp " + this.BodyTemp);
        System.out.println("Age " + this.Age);
        System.out.println("Weight " + this.Weight);
        System.out.println("Hair length " + this.HairLength);
        System.out.println("Name " + this.name);
    }
}