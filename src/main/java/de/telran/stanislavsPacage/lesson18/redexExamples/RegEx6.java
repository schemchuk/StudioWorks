package de.telran.stanislavsPacage.lesson18.redexExamples;

public class RegEx6 {
    public static void main(String[] args) {
        RegExMainMethod regExMain = new RegExMainMethod();

        String inputString = "mycat ourcat23 yourcat23_super theycattti5_5e cat7&6 asd&cat333";

        //======= найти все вхождения комбинаций в текст
        // где то что мы ищем должно включать в себя 'cat'

        String regEx = "(\\w*)cat\\S*";
        //=========

        regExMain.regExMyMethod(inputString, regEx);
    }
}
