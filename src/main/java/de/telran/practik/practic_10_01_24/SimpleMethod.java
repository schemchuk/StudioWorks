package de.telran.practik.practic_10_01_24;

import java.io.File;
import java.util.List;

public class SimpleMethod {
    public static void main(String[] args) {

    }
    private static void searechFile(File rootFile, List<File> filelist, String extension){
        if(rootFile.isDirectory()) {
            System.out.println("searching...." + rootFile.getAbsolutePath());
            File[] files = rootFile.listFiles();
        }
    }
}
