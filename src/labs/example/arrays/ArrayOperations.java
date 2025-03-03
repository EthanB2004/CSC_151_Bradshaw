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

}