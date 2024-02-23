package de.telran.sammary.lesson_24_02_23.car.components;

import lombok.Getter;

@Getter

public class Engine {
   private double volume;
   private double mileage;
   private  boolean isOn;
   private boolean isElectric;

    public Engine(double volume, double mileage) {

        this.volume = volume;
        this.mileage = mileage;
    }
    public void onEngine(){
        isOn = true;
    }
    public void offEngine(){
        isOn = false;
    }

    public void goEngine(double mileage){
        if (isOn) {
            this.mileage += mileage;
        } else {
            System.out.println("The engine is off");
        }
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

}
