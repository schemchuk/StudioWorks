package de.telran._JavaProStudio.module4.lesson2.io_pacade;

import java.io.File;

public class SimpleDirectory {

    public static void main(String[] args) {
        String patf = "src";
        File directory = new File(patf);

        if (directory.isDirectory()) {
            String[] content = directory.list();

            if(content != null)
                for (String eachFile : content) {
                    File file = new File(patf + "/" + eachFile);
                    System.out.println(file.isDirectory() ? (eachFile + " is directory") : (eachFile + " is file")) ;
                }
        }
    }
}
