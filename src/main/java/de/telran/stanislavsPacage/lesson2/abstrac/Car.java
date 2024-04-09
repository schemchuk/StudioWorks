package de.telran.stanislavsPacage.lesson2.abstrac;

public abstract class Car {
    protected String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        printCarName();
        return model;
    }
    private void printName(){
        System.out.println("Model name is " + model);
    }

    public void printCarName(){
        System.out.println("Our car model is " + model);
    }

    abstract void  speedUp();

    void beep(){
        System.out.println("");
    }
}
