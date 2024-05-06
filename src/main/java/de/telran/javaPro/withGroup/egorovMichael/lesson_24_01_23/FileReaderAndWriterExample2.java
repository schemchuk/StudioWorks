package de.telran.javaPro.withGroup.egorovMichael.lesson_24_01_23;

import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriterExample2 {
    public static void main(String[] args) {
String text = "Wasya -> For Example, in below code snippet, we have declared a variable number, \nthen in next step we initialized its value and then we modiÚed its value\n";

        try(FileWriter writer = new FileWriter("1234.txt",true)){
            for (int i = 0; i < text.length(); i++) {
                writer.write(text.charAt(i));
            }

            System.out.println("DONE !!!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
