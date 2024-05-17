package de.telran.stanislavsPacage.lesson19.requestResponsesModel;

import java.util.Scanner;

public class UserConsole implements UserDataRetrieveService{
    @Override
    public String retriveTitle() {

        System.out.println("Please enter your title");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        return title;
    }
}
