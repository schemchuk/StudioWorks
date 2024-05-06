package de.telran.stanislavsPacage.lesson18.redexExamples;

public class RegEx8 {
    public static void main(String[] args) {

        RegExMainMethod regExMain = new RegExMainMethod();

        String inputString = "sdgv`sgb name245@gmail.com dffs name12@cyprus.com.cy fdaf name54@yahoo.com fdbhad name247@mail.com.de sfgbdfz";

        //======= найти все вхождения комбинаций в текст
        // где то что мы ищем должно включать в себя формат электронной почты

        String regEx = "\\w+@\\w+\\.[a-zA-Z]{2,3}(\\.[A-Za-z]{2,3})?";
        //=========

        regExMain.regExMyMethod(inputString, regEx);


    }
}
