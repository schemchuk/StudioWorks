package de.telran._JavaProStudio.module4.lesson2;

import java.io.*;

public class TestIO {
    public static void main(String[] args) throws IOException {
        File testFile = new File("testFile.txt");
        if(!testFile.exists()){
            testFile.createNewFile();
        }
        // запись в файл
        FileOutputStream streamOut = new FileOutputStream(testFile);
        streamOut.write("This is my first experience when I myself work with IO API. \nI can do everything!".getBytes());
        streamOut.close();

        //чтение из файла reader
        FileInputStream streamIn = new FileInputStream(testFile);
        Reader reader = new InputStreamReader(streamIn);
        StringBuilder inStr = new StringBuilder();
        int data = reader.read();
        while (data != -1) {
            inStr.append((char) data);
    //        System.out.print((char) data);
            data = reader.read();
        }
        reader.close();
        streamIn.close();
        System.out.println(inStr);

        //
//        inStr.delete(0, inStr.length());
//        InputStream streamInI = new FileInputStream(testFile);
//        data = streamInI.read();
//        while (data != -1) {
//            inStr.append((char) data);
////            System.out.print((char) data);
//            data = streamInI.read();
//        }
//        streamInI.close();
//        System.out.println(inStr);
    }
}
