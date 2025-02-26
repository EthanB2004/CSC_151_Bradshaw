//Ethan Bradshaw
//
package labs.example.loops;


public class WhileLoop{
    public void WhileLoop(){
        //constructor 
    }

    private void executeWhileLoop(){
        double ten = 0;
        while(ten < 10){
            System.out.println("While Loop - Iteration: " + ten);
            ten ++;
        

        }
        if(ten == 10){
            System.out.println("While loop is now over");
        }
    }

    public void callWhileLoop(){
        executeWhileLoop();
    }
}