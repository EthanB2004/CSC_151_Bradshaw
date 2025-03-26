//Ethan Bradshaw
//March 26th
//Week 11 Labs
package labs.example.fileoperations;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class FileOperations{
    private static final String FILE_PATH = "T:/CSC_151_BRADSHAW-1/src/labs/example/fileoperations/";
    private static final String FILE_NAME = FILE_PATH + "files/users.csv";
    private static final String ERROR_LOG_FILE = FILE_PATH + "logs/csv_error.log";

    public static void OpenFile(){
        //call the open() file method
        openCSVFile();


    }

    private static void openCSVFile(){
        File csv_file = new File(FILE_NAME);
        File log_File = new File(ERROR_LOG_FILE);

        try{
            BufferedWriter csv_file_writer = new BufferedWriter(new FileWriter(ERROR_LOG_FILE,true));
                    int count =0;
                    int grade = 0;
                    int average = 0;
                


            if(csv_file.exists() && log_File.exists()){
                BufferedReader br = new BufferedReader (new FileReader(FILE_NAME));
                String line = "";

                

                while((line = br.readLine()) != null){ //reached end of file marker 
                    if (count > 0){
                    String[] value = line.split(","); //splitting a string 
                    int NumOfGrades = value.length -1;
                    grade = Integer.parseInt(value[1]) + Integer.parseInt(value[2]) + Integer.parseInt(value[3]); //This should be a for loop, jsyk
                    average = grade / NumOfGrades; //get average of grades
                    System.out.println(value[0] + "'s average grade is " + average);
                }
                count++;
                grade = 0;
                average = 0;
                }
                csv_file_writer.close();
            }

        }
        catch(IOException e){
           // csv_file_writer.write(e);
            System.out.println(e);

        }
    }
}
