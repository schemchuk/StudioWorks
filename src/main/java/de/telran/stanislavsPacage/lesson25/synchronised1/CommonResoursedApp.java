package de.telran.stanislavsPacage.lesson25.synchronised1;

public class CommonResoursedApp {
    public static void main(String[] args) {
        CommonResourse resourse = new CommonResourse();

        for (int i = 0; i < 6; i++) {
            Thread thread = new Thread(new CommonResourceThread(resourse));
            thread.start();
        }
    }
}
