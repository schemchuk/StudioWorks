package de.telran.stanislavsPacage.lesson22.mockito2.userInterface;

import de.telran.stanislavsPacage.lesson22.mockito2.developerNumber1.BankServiceDB;
import de.telran.stanislavsPacage.lesson22.mockito2.developerNumber2.BankserviceCommerzBank;

public class UserMakePayment {
    public void userPayment(){

        String employeeCity = "Berlin";
        if (employeeCity == "Berlin") {
            BankServiceDB bankServiceDB = new BankServiceDB();

            //PayRoll payRoll = new PayRoll(bankServiceDB)
        }
        if (employeeCity == "Vienna") {
            BankserviceCommerzBank serviceCommertzBank = new BankserviceCommerzBank();

            //PayRoll payRoll = new PayRoll(serviceCommertzBank)
        }
    }
}
