package de.telran.javaPro.summary.work_24_05_10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class SimpleErrorLog {

    public static void writeLogException(RuntimeException e)  {

        try (FileWriter fileWriter = new FileWriter("errors.log", true);
            PrintWriter printWriter = new PrintWriter(fileWriter)){

            e.printStackTrace(printWriter);
           Date now = new Date();
             printWriter.print("Error " + now + " ");
        }catch (IOException ignor) {
           
        }
    }
    public static void main(String[] args) {

        try{
            int result = 1/0;
        }catch (RuntimeException e){
            writeLogException(e);
        }
    }
}
