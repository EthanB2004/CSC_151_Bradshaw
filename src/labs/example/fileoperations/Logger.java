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
        file2.close(); */ //Week 12 

       BufferedReader file3 = openErrorLog(); //lab 1 week 13
        getDiskSpaceErrorsWithIPAddress(file3);
        file3.close(); 

         openErrorLog("http_access.log"); //lab 2 week 13

       BufferedReader httpHandle3 = openErrorLog("http_access.log");
        getGMTOffset(httpHandle3);    //Lab 3 Week 13
        httpHandle3.close();



        BufferedReader httpHandle4 = openErrorLog("http_access.log");
        getHTTPCode(httpHandle4); //lab 4 Week 13
        httpHandle4.close();

        BufferedReader httpHandle5 = openErrorLog("http_access.log");
        getResponseSizes(httpHandle5); //lab 5 Week 13
        httpHandle5.close();

        BufferedReader httpHandle6 = openErrorLog("http_access.log");
        groupHTTPMethodsAndEndpoints(httpHandle6); //lab 6 Week 13
        httpHandle6.close();



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

    private static BufferedReader openErrorLog(String filename)throws IOException{  //Week 13 lab 2
        BufferedReader br = new BufferedReader(new FileReader(FILE_PATH + "logs/" + filename));
        return br;
    }

    private static void getGMTOffset(BufferedReader file)throws IOException{ //Week 13 lab 3
       ArrayList <Integer> offsetCountList = new ArrayList<>(); 
       ArrayList <String> offsetList= new ArrayList<String>(); 
       String offset = "";
       String line = "";
       int index = 0;

       while((line = file.readLine()) != null){
        String[] lineValue = line.split(" ");
        offset = lineValue[4].replace("]", "");
        if(offsetList.contains(offset) == false){
            offsetList.add(offset);
            offsetCountList.add(1);
        }
        else {
            index = offsetList.indexOf(offset);
            offsetCountList.set(index, (offsetCountList.get(index) + 1));
        }

       }

       for(int i = 0; i < offsetList.size(); i++){
        System.out.println("Time " + offsetList.get(i) + " Count : "+ offsetCountList.get(i));
       }


    }

    private static void getHTTPCode(BufferedReader file)throws IOException{
        String line = "";
        int fiveHundredKCount =0;
        int fourHundredCount = 0;
        int twoHundredKCount = 0;
        int threeHundredKCount = 0;

        while((line = file.readLine()) !=null){
            String[] lineValue = line.split(" ");

            char[] responseCode = lineValue[8].toCharArray();
            

            
            switch(responseCode[0]){
                case '5':
                    fiveHundredKCount = fiveHundredKCount + 1;
                    break;
                case '2':
                    twoHundredKCount = twoHundredKCount + 1;
                    break;
                case '3':
                    threeHundredKCount = threeHundredKCount + 1;
                    break;
                case '4':
                    fourHundredCount = fourHundredCount + 1;
                    break;
            }
        }
        System.out.println("5xx Errors: " + fiveHundredKCount);
        System.out.println("4xx Errors: " + fourHundredCount);
        System.out.println("3xx Errors: " + threeHundredKCount);
        System.out.println("2xx Errors: " + twoHundredKCount);
    }

    private static void getResponseSizes(BufferedReader file)throws IOException{
        String line = "";
        int greaterCount = 0;

        while((line = file.readLine()) != null){
            String [] lineValue = line.split(" ");
            if(Integer.parseInt(lineValue[9]) > 3900){
                greaterCount = greaterCount + 1;
            }
        }
        System.out.println(greaterCount);
    }

    private static void groupHTTPMethodsAndEndpoints(BufferedReader file)throws IOException{
        String line = "";
        ArrayList <String> verbslist = new ArrayList<String>();
        String verb = "";

        while((line = file.readLine()) != null){
            String [] lineValue = line.split(" ");
            verb = lineValue[5].replace("\"", "");
            if(verbslist.contains(verb) == false){
                verbslist.add(verb);
            }
        }
        System.out.println("Verbs:");
        for(int i = 0; i < verbslist.size(); i++){ 
         System.out.println(" -" + verbslist.get(i) );
       }
    }
}