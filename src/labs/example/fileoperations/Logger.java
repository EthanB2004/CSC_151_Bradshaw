//Week 12 Java, Ethan Bradshaw
//March 31st :)
package labs.example.fileoperations;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Logger{
    private static final String FILE_PATH = "T:/CSC_151_BRADSHAW-1/src/labs/example/fileoperations/";
    private static final String ERROR_FILE = FILE_PATH + "logs/api_error.log";


    public static void main(String[] args)throws IOException{
       /* BufferedReader file = openErrorLog();
        //readAPI();
        getCountOfErrorTypes(file);
        file.close();

        BufferedReader file2 = openErrorLog();
        getMemoryLimitExceededCount(file2);
        file2.close(); */

       /* BufferedReader file3 = openErrorLog(); //lab 1 week 13
        getDiskSpaceErrorsWithIPAddress(file3);
        file3.close(); */

        openErrorLog("http_access.log");



    }

    public static void readAPI(){ //reads the file and is Lab 1
        File log_File = new File(ERROR_FILE);

        try{
            String line = "";
            if(log_File.exists()){
                BufferedReader br = new BufferedReader (new FileReader(ERROR_FILE));

                while((line = br.readLine()) != null){
                    System.out.println(line);
                }
                 br.close();
            }
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static BufferedReader openErrorLog()throws IOException{ //returns buffered file reader object handle Lab 2
    BufferedReader br = new BufferedReader(new FileReader(ERROR_FILE));

    return br;

    }

    private static void getCountOfErrorTypes(BufferedReader file) throws IOException{ //lab 3 & 4????
        int error_count = 0;
        int warn_count = 0;
        int info_count = 0;
        int debug_count = 0;
        String line = "";
         while((line = file.readLine()) != null){
                  String[] lineValue = line.split(" ");

                  switch(lineValue[2]){
                    case "[ERROR]":
                         error_count = error_count + 1;
                         break;
                    case "[WARN]":
                        warn_count = warn_count + 1;
                        break;
                    case "[INFO]":
                        info_count =  info_count + 1;
                        break;
                    case "[DEBUG]":
                        debug_count = debug_count + 1;
                        break;
                  }
                }
                System.out.println("Total Error: " + error_count);
                System.out.println("Total Warn: " + warn_count);
                System.out.println("Total Info: " + info_count);
                System.out.println("Total Debug: " + debug_count);
               

    }

    private static void getMemoryLimitExceededCount(BufferedReader file)throws IOException{ //Lab 5
        ArrayList <String> endpointList = new ArrayList<String>();
        int memoryLimitExceededCount = 0;
        String line = "";
        while((line = file.readLine()) != null){
            String[] lineValue =line.split(" ");
             if(lineValue[5].equals("Memory")){
                 memoryLimitExceededCount = memoryLimitExceededCount + 1;
                endpointList.add(lineValue[13]);
            }
            
        }
        System.out.println("Memory Limit Exceeded Count " + memoryLimitExceededCount);
        for(String endPoint: endpointList){
            System.out.println(endPoint);
        }

    }
    private static void getDiskSpaceErrorsWithIPAddress(BufferedReader file)throws IOException{ //Week 13 lab 1
       ArrayList <String> endPointList = new ArrayList<String>(); 
       String line = "";
       int lineNumber = 0;

       while((line = file.readLine()) != null){
        String[] lineValue = line.split(" ");
        if(lineValue[5].equals("Disk")){
            System.out.println("Disk space error on line " +lineNumber + " for IP Address: " +lineValue[3]);
        }
        lineNumber = lineNumber + 1;
       }
    }

    private static BufferedReader openErrorLog(String filename)throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(FILE_PATH + "logs/" + filename));
        return br;
    }
}