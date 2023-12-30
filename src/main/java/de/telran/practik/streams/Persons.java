package de.telran.practik.streams;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public class Persons {
    private String lastName;
    private String firstName;
    private int age;
    private double salary;

    public Persons() {
    }

    public static List<Persons> generatePerson(int numberOfPersons, Faker faker) {
        List<Persons> persons = new ArrayList<>();

        for (int i = 0; i < numberOfPersons; i++) {
            String lastName = faker.name().lastName();
            String firstName = faker.name().firstName();
            int age = faker.number().numberBetween(18, 65);
            double salary = faker.number().randomDouble(2, 800, 2500);

            Persons person = new Persons(lastName, firstName, age, salary);
            persons.add(person);
        }
        return persons;
    }

    @Override
    public String toString() {
        return
                lastName + " " + firstName + " " + age + " salary is: " + salary ;
    }

    public List<Persons> generatePersonList(int numberOfPersons) {
        List<Persons> persons = new ArrayList<>();

        Faker faker = new Faker();
        for (int i = 0; i < numberOfPersons; i++) {
            String lastName = faker.name().lastName();
            String firstName = faker.name().firstName();
            int age = faker.number().numberBetween(18, 65);
            double salary = faker.number().randomDouble(2, 800, 2500);

            Persons person = new Persons(lastName, firstName, age, salary);
            persons.add(person);
        }
        return persons;

        //-------------------------------------------------------------------------------
        // Для визову нового листа з фейкером---------------------------------------
        // Persons personsInstance = new Persons();
        //        List<Persons> makePersons = personsInstance.generatePersonList(6);
        //----------------------------------------------------------------------------------------


    }
}



