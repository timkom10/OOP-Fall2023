package Assignment2.Question2;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Report {


    public static void printToConsole(Reportable reportable){
        System.out.println(reportable.generateReport());
    }

    public static void persistToCSV(Reportable reportable, String fileName){
        File file = new File(fileName);
        try {
            FileWriter outputfile = new FileWriter(file);
            outputfile.write(reportable.generateReport());
            outputfile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
