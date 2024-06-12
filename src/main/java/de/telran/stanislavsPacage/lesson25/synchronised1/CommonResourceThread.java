package de.telran.stanislavsPacage.lesson25.synchronised1;

public class CommonResourceThread implements Runnable {

    CommonResourse resourse = new CommonResourse();

    public CommonResourceThread(CommonResourse resourse) {
        this.resourse = resourse;
    }

    @Override
    public void run() {
        resourse.increment();
    }
}