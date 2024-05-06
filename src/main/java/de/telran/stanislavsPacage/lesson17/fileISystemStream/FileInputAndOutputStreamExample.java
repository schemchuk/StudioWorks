package de.telran.stanislavsPacage.lesson17.fileISystemStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputAndOutputStreamExample {
    public static void main(String[] args) throws IOException {

        outputExample();
        inputExample();

    }

    public static void outputExample() throws IOException {
        String path = "test_stream.txt";
        FileOutputStream outputStream = new FileOutputStream(path);
        outputStream.write("\n Hello from jawa output stream".getBytes());
        outputStream.close();
    }

    public static void inputExample() throws IOException {
        String path = "test_stream.txt";
        FileInputStream input = new FileInputStream(path);

        int inputData = input.read();

        while ((inputData != -1)) {
            System.out.print((char) inputData  + " ");
            inputData = input.read();
        }
        input.close();
    }
}
