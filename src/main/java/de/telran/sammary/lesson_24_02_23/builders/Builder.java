package de.telran.sammary.lesson_24_02_23.builders;

public interface Builder {
    void setCarType(CarType carType);
    void  setEngine(Engine engine);
    void  setTransmission(Transmission transmission);

    void setCarType(CarType carType);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void  setSeats(int seats);
    void  setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
