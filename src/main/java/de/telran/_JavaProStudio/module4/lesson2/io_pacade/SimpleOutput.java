package de.telran._JavaProStudio.module4.lesson2.io_pacade;

import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleOutput {
    public static void main(String[] args) {
        String text = "Salomon Samsonovich";
        byte[] bytes = text.getBytes();

        try (FileOutputStream stream = new FileOutputStream("file.txt")) {
            for (byte eachByte : bytes) {
                stream.write(eachByte);
            }
        }catch (IOException exception) {
            System.out.println("Output error");
        }
    }
}
