package de.telran.sammary.lesson_24_02_23.car.components;

import de.telran.sammary.lesson_24_02_23.builders.Car;

public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }
    public void showFuei(){
        System.out.println("Fuel level ->" + car.getFuel());
    }

    public void showStatus(){
        if (this.car.getEngine().getEngine.isOn()) {
            System.out.println("Car is started");
        }else {
            System.out.println("Car is not started");
        }
    }
}
