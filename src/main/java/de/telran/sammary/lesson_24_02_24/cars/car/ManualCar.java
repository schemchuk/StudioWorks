package de.telran.sammary.lesson_24_02_24.cars.car;

import de.telran.sammary.lesson_24_02_24.cars.components.Engine;
import de.telran.sammary.lesson_24_02_24.cars.components.GPSNavigator;
import de.telran.sammary.lesson_24_02_24.cars.components.Transmission;
import de.telran.sammary.lesson_24_02_24.cars.components.TripComputer;
import lombok.Setter;

public class ManualCar {
    private final CarType carType;
    private final Engine engine;
    private final Transmission transmission;
    private  int seats;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;


    public ManualCar(CarType carType, Engine engine, Transmission transmission, int seats, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.engine = engine;
        this.transmission = transmission;
        this.seats = seats;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    @Override
    public String toString() {
        return "ManualCar{" +
                "carType=" + carType +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", seats=" + seats +
                ", tripComputer=" + tripComputer +
                ", gpsNavigator=" + gpsNavigator +
                '}';
    }
}
