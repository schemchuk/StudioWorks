package de.telran.stanislavsPacage.lesson2.abstrac;

public class Sedan extends Car{
    public Sedan(String name) {
        super(name);
    }

    @Override
    void speedUp() {
        System.out.println("Sedan sopeedUp!");
    }

    @Override
    void  beep(){
        System.out.println("BEEEEP!!!");
    }
}
