package de.telran.sammary.lesson_24_02_24.cars.components;

import lombok.Getter;

public class GPSNavigator {
    @Getter
    private String route;

    public GPSNavigator() {
        route = "Home";
    }

    public GPSNavigator(String route) {
        this.route = route;
    }
}
