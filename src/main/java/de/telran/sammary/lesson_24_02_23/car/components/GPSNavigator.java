package de.telran.sammary.lesson_24_02_23.car.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator(String route) {
        this.route = route;
    }

    public GPSNavigator() {
        route = "Home";
    }

    public String getRoute() {
        return route;
    }
}
