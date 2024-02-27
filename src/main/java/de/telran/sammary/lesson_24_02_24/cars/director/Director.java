package de.telran.sammary.lesson_24_02_24.cars.director;

import de.telran.sammary.lesson_24_02_24.cars.builders.Builder;
import de.telran.sammary.lesson_24_02_24.cars.car.CarType;
import de.telran.sammary.lesson_24_02_24.cars.components.Engine;
import de.telran.sammary.lesson_24_02_24.cars.components.GPSNavigator;
import de.telran.sammary.lesson_24_02_24.cars.components.Transmission;
import de.telran.sammary.lesson_24_02_24.cars.components.TripComputer;

public class Director {
    public void sportCar(Builder builder) {
        builder.setCarType(CarType.SPORT_CAR);
        builder.setEngine(new Engine(4.5,10));
        builder.setSeats(2);
        builder.setTransmission(Transmission.MANUAL);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void truck(Builder builder) {
        builder.setCarType(CarType.TRUCK);
        builder.setEngine(new Engine(8,50000));
        builder.setSeats(3);
        builder.setTransmission(Transmission.MANUAL);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void suv(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setEngine(new Engine(2.4,0));
        builder.setSeats(7);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void cityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setEngine(new Engine(1.2,100));
        builder.setSeats(5);
        builder.setTransmission(Transmission.ROBOT);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
}
