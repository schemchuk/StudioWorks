package de.telran.javaPro.lections.lesson_24_06_05;

import java.util.List;

public class CarProduction {

    static  class Wheel{

    }
    static class CarBody{

    }

    static class Car{
        List<Wheel> wheels;
                CarBody carDetails;

        public Car(List<Wheel> wheels, CarBody carDetails) {
            this.wheels = wheels;
            this.carDetails = carDetails;
        }
    }
}
