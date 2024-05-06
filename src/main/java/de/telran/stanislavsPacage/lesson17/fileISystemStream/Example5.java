package de.telran.stanislavsPacage.lesson17.fileISystemStream;

import java.io.File;
import java.util.Arrays;

public class Example5 {
    public static void main(String[] args) {
        File file = new File("testForWriting.txt");
        boolean isExists = file.exists();
        System.out.println("Does file exist? " + isExists);

        file = new File("new_dir");
        boolean wasCreate = file.mkdir();
        System.out.println("Directory was created: " + wasCreate);

        File directory = new File("new_dir");
        boolean isDir = directory.isDirectory();
        System.out.println(isDir);

//        boolean succes = directory.delete();
//        System.out.println(succes);

        String[] fileNames = directory.list();
        File[] files = directory.listFiles();

        System.out.println(Arrays.toString(fileNames));
        System.out.println(Arrays.toString(files));
    }
}
