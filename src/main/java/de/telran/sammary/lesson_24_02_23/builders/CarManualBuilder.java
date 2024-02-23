package de.telran.sammary.lesson_24_02_23.builders;


public class CarManualBuilder implements Builder {

    private CarType carType;
    private Engine engine;
    private Transmission transmission;
    private int seats;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;

    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;

    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;

    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;

    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;

    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;

    }

    public ManualCar getCar() {
        return new ManualCar(carType, engine, transmission, seats, tripComputer, gpsNavigator);
    }
}


