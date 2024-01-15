package de.telran._JavaProStudio.module4.lesson2.io_pacade;

import java.io.FileInputStream;
import java.io.IOException;

public class SimpleRaed {
    public static void main(String[] args) {
        try (FileInputStream stream = new FileInputStream("file.txt")) {
            int symbol;
            while ((symbol = stream.read()) != -1) {
                System.out.println((char) symbol);
            }
        } catch (IOException exception) {
            System.out.println("Input error");
        }
    }
}
