package de.telran.stanislavsPacage.lesson2.abstrac;

public class CarDemo2 {
    public static void main(String[] args) {

        Sedan sedan1 = new Sedan("Volwo");
        Sedan sedan2 = new Sedan("BMW");
        Sedan sedan3 = new Sedan("Zapor");

        SportCar sportCar1 = new SportCar("Maseratti");
        SportCar sportCar2 = new SportCar("Lamborgini");
        SportCar sportCar3 = new SportCar("BMW");

        Truck truck1 = new Truck("Volwo");
        Truck truck2 = new Truck("Tatra");
        Truck truck3 = new Truck("Man");

       Car[] cars = {sedan1,sedan2,sportCar1,sportCar2,truck1,truck2,sedan3,sportCar3,truck3};
        for (int i = 0; i < cars.length; i++) {
            cars[i].speedUp();
            cars[i].printCarName();
            cars[i].beep();

        }
    }
}
