package de.telran.stanislavsPacage.lesson18.redexExamples;

public class RegEx9 {
    public static void main(String[] args) {

        RegExMainMethod regExMain = new RegExMainMethod();

        String inputString = "java Java JAVA j.a.v.a JaaaVa JavaSE";

        //======= найти все вхождения комбинаций в текст
        // где то что мы ищем должно включать в себя все возможные набор с java

        String regEx = "[Jj]\\.?[Aa]+\\.?[Vv]\\.?[Aa](SE)?";
        //=========

        regExMain.regExMyMethod(inputString, regEx);


    }
}
