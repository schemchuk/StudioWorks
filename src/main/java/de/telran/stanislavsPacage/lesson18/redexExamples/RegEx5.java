package de.telran.stanislavsPacage.lesson18.redexExamples;

public class RegEx5 {
    public static void main(String[] args) {
        RegExMainMethod regExMain = new RegExMainMethod();

        String inputString = "cat cat23 cat23_super cattti5_5e cat7&6 cat333";

        //======= найти все вхождения комбинаций в текст
        // где то что мы ищем должно включать в себя 'cat'

        String regEx = "cat\\S*";
        //=========

        regExMain.regExMyMethod(inputString, regEx);
    }
}
