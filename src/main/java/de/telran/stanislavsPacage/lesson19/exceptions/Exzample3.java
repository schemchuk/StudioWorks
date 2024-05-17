package de.telran.stanislavsPacage.lesson19.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class Exzample3 {
    public static void main(String[] args) {

        exceptionExampleFinalBlock();
        System.out.println("Program is finish");
    }

    public static void exceptionExampleFinalBlock(){
        FileWriter writer = null;
        try {
            writer = new FileWriter("out.txt");
            writer.write("Writing to the file");
            System.out.println("Файл записан успешно");
        }catch (IOException e) {
            System.out.println("Ошибка записи в файл");
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Ошибка закрытия файла");
                }
            }
        }

    }
}
