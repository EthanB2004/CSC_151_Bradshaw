//Ethan Bradshaw
//Feb 26th

package labs.example.loops;
public class ForLoop{
    public void ForLoop(){
        //constructor
    }

    private void executeForLoop(){
        for (int count = 0; count <20; count++)
        System.out.println("For Loop: Iteration: " + count);

    }

    private int sumLoopCounter(int Loops){
       int sum = 0 ;
        for(int counter = 1; counter <= Loops; counter++){
            sum = counter + sum; 

        }
        return sum;

    }

    private void printMultiplicationTable(int number){
        int product= 0;
        for(int count = 0; count <= 12; count ++){
            product = count * number;
            System.out.println(number + " * " + count + " = " + product);
        }
    }

    public void callPrintMultiplicationTable(int number){
        printMultiplicationTable(number);
    }



    
    public int callSumLoopCounter(int Loops){
        int sum;
        sum = sumLoopCounter(Loops);
        return sum;
    }

    private int sumTwoNumbers(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public int callSumTwoNumbers(int num1, int num2){
        int sum;
        sum = sumTwoNumbers(num1, num2);
        return sum;
    }



   

    public void CallForLoop(){
        
       // executeForLoop();

    }
}