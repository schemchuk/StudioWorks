package de.telran.sammary.lesson_24_02_24.cars.builders;

import de.telran.sammary.lesson_24_02_24.cars.car.CarType;
import de.telran.sammary.lesson_24_02_24.cars.components.*;

public interface Builder {
    void setCarType(CarType carType);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setSeats(int seats);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);


}
