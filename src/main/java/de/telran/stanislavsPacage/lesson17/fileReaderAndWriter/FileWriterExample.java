package de.telran.stanislavsPacage.lesson17.fileReaderAndWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("writerExample.txt"));

        writer.newLine();
        writer.write("Hello, Wordl!");
        writer.newLine();
        writer.write("This is our example working with bufferWriter");

        writer.flush();
        writer.close();


    }
}
