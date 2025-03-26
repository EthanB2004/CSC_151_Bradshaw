package.labs.example.fileOperations;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class FileOperator{
    private static final String FILE_PATH = "T:/CSC_151_BRADSHAW-1/src/labs/example/fileoperations/";
    private static final String FILE_NAME = "fles/users.csv";
    private static final String ERROR_LOG_FILE = FILE_PATH + "logs/csv_error.log";

    public static void main(){
        //call the open() file method
        openCSVFile();


    }

    private static void openCSVFile(){
        File csv_file = new File(FILE_NAME);
        File log_File = new File(ERROR_LOG_FILE);
        int count =0;

        try{
            BufferedWriter csv_file_writer = new BufferedWriter(new FileWriter(ERROR_LOG_FILE,true));

            if(csv_file.exists() && log_file.exists()){
                BufferedWriter br = new BufferedWriter(new FileReader(File_Name));

                if (count > 0){
                    String[] value = line.split(","); //splitting a string 
                }

                while((line = br.readline()) != null){ //reached end of file marker 
                    csv_file_writer.write(message);
                    //Integer.parseInt("52"); //Converts string to integer
                }
                csv_file_writer.close();
            }

        }
        catch(IOException e){

        }
    }
}