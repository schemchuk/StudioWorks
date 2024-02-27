package de.telran.sammary.lesson_24_02_24.cars;

import de.telran.sammary.lesson_24_02_24.cars.builders.CarBuilder;
import de.telran.sammary.lesson_24_02_24.cars.builders.CarManualBuilder;
import de.telran.sammary.lesson_24_02_24.cars.car.Car;
import de.telran.sammary.lesson_24_02_24.cars.car.ManualCar;
import de.telran.sammary.lesson_24_02_24.cars.director.Director;

public class CarDemo {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder= new CarBuilder();
        director.sportCar(builder);
        Car car = builder.getCar();
        System.out.println("Car was build" + car);

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.cityCar(manualBuilder);
        ManualCar manualCar = manualBuilder.getCar();
        System.out.println("ManualCar was build" + manualCar);
    }
}
