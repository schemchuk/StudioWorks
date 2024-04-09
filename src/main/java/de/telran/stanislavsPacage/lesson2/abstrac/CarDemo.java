package de.telran.stanislavsPacage.lesson2.abstrac;

public class CarDemo {
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

        Sedan[] sedans = {sedan1,sedan2,sedan3};
        SportCar[] sportCars = {sportCar1,sportCar2,sportCar3};
        Truck[] trucks = {truck1,truck2,truck3};


        for (int i = 0; i <sedans.length ; i++) {
            System.out.println(sedans[i].getModel());
            sedans[i].speedUp();
        }
        System.out.println("===========");

        for (int i = 0; i < sportCars.length; i++) {
            sportCars[i].speedUp();
        }

        System.out.println("===========");
        for (int i = 0; i < trucks.length; i++) {
            trucks[i].speedUp();
        }
    }
}
