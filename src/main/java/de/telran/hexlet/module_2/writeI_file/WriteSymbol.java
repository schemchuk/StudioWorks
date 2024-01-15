package de.telran.hexlet.module_2.writeI_file;

import java.io.FileWriter;
import java.io.IOException;

public class WriteSymbol {
    public static void main(String[] args) {
        String text = "Sraka banka";
        char[] chars = new char[text.length()];
        text.getChars(0, chars.length,chars, 0);

        try (FileWriter writer = new FileWriter("file.txt")) {
            for (char eachChar : chars) {
                writer.write(eachChar);
            }
        } catch (IOException exception) {
            System.out.println("Output error");
        }
    }
}
