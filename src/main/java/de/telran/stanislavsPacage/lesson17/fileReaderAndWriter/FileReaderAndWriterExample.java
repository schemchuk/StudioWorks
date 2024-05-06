package de.telran.stanislavsPacage.lesson17.fileReaderAndWriter;

import java.io.*;

public class FileReaderAndWriterExample {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("writerExample.txt");
        BufferedReader reader = new BufferedReader(fileReader);

        BufferedWriter writer = new BufferedWriter(new FileWriter("writerExampleDouble.txt"));

        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            writer.write(line);
            writer.newLine();
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
