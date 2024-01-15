package de.telran._JavaProStudio.module4.lesson2.io_pacade;

import java.io.File;

public class SimpleFile {
    public static void main(String[] args) {
        String path = "home/volodymyr/experiments/studyInstruction.txt";
        File file = new File(path);

        System.out.println("File name: " + file.getName() + "\n");

        System.out.println("Absolute path: " + file.getAbsolutePath() + "\n");
        System.out.println("Path: " + file.getPath());

        System.out.println( "parent directory: " + file.getParent());

        System.out.println("File " + (file.canWrite() ? "writable" : "notwritable"));
        System.out.println("File: " + (file.canRead() ? "redable" : "notredable"));


    }
}
