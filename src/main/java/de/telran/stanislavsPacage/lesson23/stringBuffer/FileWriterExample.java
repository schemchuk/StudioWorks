package de.telran.stanislavsPacage.lesson23.stringBuffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
        writer.newLine();
        writer.write("hello wordl");
        writer.newLine();
        writer.write("This is our example with bufferWritter");
        writer.flush();
        writer.close();
    }
}
