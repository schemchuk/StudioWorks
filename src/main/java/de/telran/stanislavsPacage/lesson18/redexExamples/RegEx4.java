package de.telran.stanislavsPacage.lesson18.redexExamples;

public class RegEx4 {
    public static void main(String[] args) {
        RegExMainMethod regExMain = new RegExMainMethod();

        String inputString = "привет Антон Александр Алла Андрей";

        //======= найти все вхождения комбинаций в текст
        // где то что мы ищем должно начинаться с 'A' и заканчиваться 'a'

        String regEx = "А[а-я]+а";
        //=========

        regExMain.regExMyMethod(inputString, regEx);
    }
}
