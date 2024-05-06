package de.telran.javaPro.withGroup.egorovMichael.lesson_24_01_23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReraderAndWriterExample1 {
   // new FileReader("/home/volodymyr/IdeaProjects/StudioWorks/src/main/java/de/telran/javaPro/withGroup/egorovMichael/lesson_24_01_23/prog.txt");
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("/home/volodymyr/IdeaProjects/StudioWorks/src/main/java/de/telran/javaPro/withGroup/egorovMichael/lesson_24_01_23/prog.txt")) ) {
      String str;
            while ((str = reader.readLine()) != null) {
                System.out.println( str );
            }
            System.out.println("DONE !!!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
