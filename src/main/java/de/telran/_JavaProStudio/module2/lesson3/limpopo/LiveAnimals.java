package de.telran._JavaProStudio.module2.lesson3.limpopo;

public class LiveAnimals {
    public static void main(String[] args) {
        long start = 10_000_000;
        int days = 10 * 365;
        for (int i = 1; i <= days ; i++) {
            start = start - 8 + 14;
            if(i % 365 == 0){
                System.out.println("Э Сейчас в Лимпопо живет " + start);
            }

        }
    }
}
