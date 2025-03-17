//Ethan Bradshaw
//March 3rd
//Arrays
package labs.example.arraycheck;

public class ArrayCheck{
    public void ArrayCheck(){

    }
    public void CheckLengthAndValues(){
        int[] firstArray = {5, 10, 6, 9, 11};
        int[] secondArray = {5, 10, 5, 9, 11};

        if (firstArray.length == secondArray.length)
        {
            for(int i =0; i <firstArray.length; i++){
                if (firstArray[i] == secondArray[i])
                {
                    System.out.println("Values in position "+ i + " are the same");
                }
                else
                {
                    System.out.println("Values in position " + i + " are not the same");
                }
            }
            System.out.println("lengths of arrays are the  same");
        }
        else{
            System.out.println("lengths of arrays are not the same");

        }
    }

    public void comparingSize(){
        int[] arr1 = {43, 7, 98, 15, 62, 29, 85, 21, 54, 33, 77, 91, 11, 64, 36, 72, 50, 19, 39, 23, 88, 58, 41, 28, 3};
        int[] arr2 ={17, 53, 90, 82, 11, 41, 64, 27, 38, 6, 75, 60, 84, 24, 19, 48, 92, 36, 66, 8, 29, 15, 52, 83, 1};
        int[] arr3 = {4, 39, 66, 72, 12, 59, 9, 51, 87, 35, 46, 73, 56, 31, 99, 5, 18, 20, 63, 61, 79, 80, 2, 70, 14};

        int sum1 =0;
        int sum2 =0;
        int sum3 =0;

        for (int i =0; i < arr1.length; i ++)
        {
            sum1 = sum1 + arr1[i];
            sum2 = sum2 + arr2[i];
            sum3 = sum3 + arr3[i];
        }
        System.out.println("Array One Sum; " + sum1);
        System.out.println("Array Two Sum; " + sum2);
        System.out.println("Array Three Sum; " + sum3);

        if(sum1 > sum2 && sum1 > sum3)
        {
            System.out.println("The sum of the first array is the greatest with a sum of; " + sum1);


        }
        else if (sum2 > sum1 && sum2 > sum3)
        {
            System.out.println("The sum of the second array is the greatest with a sum of; " + sum2);


        }
        else
        {
            System.out.println("The sum of the third array is the greatest with a sum of; " + sum3);
        }
    }

    public void HighestValue(){
        int[] myArray = {98, 4, 162, 684, 897, 374, 615, 228, 811, 156, 999, 244, 377, 1, 623, 578, 302, 688, 276, 766, 826, 590, 312, 492, 365, 713, 37, 145, 381, 504, 470, 607, 735, 355, 849, 267, 419, 399, 697, 288, 324, 818, 292, 497, 936, 963, 649, 755, 708, 811} ;
        int highestValue = 0;
        for(int i = 0; i < myArray.length; i ++){
            if( highestValue < myArray[i])
            {
                highestValue = myArray[i];
            }
        }
        System.out.println("The highest value in the myArray object is: " + highestValue);

    }
}