package de.telran.stanislavsPacage.lesson18.redexExamples;

public class RegEx10 {
    public static void main(String[] args) {

        RegExMainMethod regExMain = new RegExMainMethod();

        String inputString = "A(a,b,c)(x,y,z)Z 1 2 3 4 5";

        //======= найти все вхождения комбинаций в текст
        // где то что мы ищем должно включать в себя все возможные набор с java

        String regEx = "[^\\s\\d]+";
        //=========

        regExMain.regExMyMethod(inputString, regEx);


    }
}
