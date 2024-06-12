package de.telran.stanislavsPacage.lesson26.volatileExemple;

public class SharedData {
    private volatile boolean flag = false;

    public void SetFlag() {
        flag = true;
    }

    public void doSomething() {
        if (flag) {
            System.out.println("Флаг установлен!");
        }
    }
}
