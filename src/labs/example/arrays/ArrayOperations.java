//Ethan Bradshaw
//March 3rd
//Arrays

package labs.example.arrays;
public class ArrayOperations{
    public void ArrayOperations(){
        //constructor

    }

    public void createNewArray(int arrayLength){

        int[] numbers = new int [arrayLength];
        for(int i = 0; i < arrayLength ; i++)
        {
            numbers[i] = arrayLength;
        }

        for( int p = 0; p < arrayLength; p++)
        {
            numbers[p] = numbers[p] + p;
        }

        displayArray(arrayLength, numbers);

    }

    private void displayArray(int YOUR_ARRAY_LENGTH_HERE, int[] numbers){
        System.out.println("I created a new array and it now has " + YOUR_ARRAY_LENGTH_HERE + " items in it ");
        System.out.println("The array and their values are listed below:");
        
        for(int i = 0; i < YOUR_ARRAY_LENGTH_HERE; i++){
            System.out.println(numbers[i]);
        }
    }
    public void sortArray(){
        int[] numbers = {44,21,6,7,18,20,43,29,36,35,9,27,8,12,26,13,12,10,4,16,14,50,28,49,17,38,32,31,39,40,45,3,1,24,46,11,37,42,30,19,15,22,41,23,5,48,47,33,34,25};

        
         for (int i = 0; i <numbers.length -1; i++)
        {
            if (numbers[i] > numbers[i+1]){
                int tempvalue = numbers[i+1];
                numbers[1+i] = numbers [i];
                numbers[i] = tempvalue;
                i=-1;
              }
        }

        for(int j = 0; j<numbers.length; j++)
        {
            System.out.print(numbers[j] + ", ");
        }
         

    }

    public void getDaysAndMonths(){
        System.out.println("");
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}; 

        for (int i =0; i < days.length; i++){
            System.out.println("There are " + days[i]+"days In " + months[i]);
        }
    }

}