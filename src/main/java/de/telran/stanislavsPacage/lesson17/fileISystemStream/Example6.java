package de.telran.stanislavsPacage.lesson17.fileISystemStream;

import java.io.*;
import java.util.Arrays;

public class Example6 {
    public static void main(String[] args) throws IOException {
        String data = "This is file output stream";

        FileOutputStream fileOutputStream = new FileOutputStream("test2.txt");

        byte[] byteArray = data.getBytes();
        System.out.println(Arrays.toString(byteArray));

        fileOutputStream.write(byteArray);

        fileOutputStream.close();

        OutputStream outputStream = new FileOutputStream("test3.txt");
        InputStream inputStream = new FileInputStream("test3.txt");

        outputStream.write('a');
        outputStream.write('b');
        System.out.println("" + (char) inputStream.read());
        System.out.println("" + (char) inputStream.read());
    }
}
