package de.telran.stanislavsPacage.lesson8.hacsCodeExample.mapKeyCollision;

import java.util.HashMap;
import java.util.Map;

public class ChangeKeyMapExample {
    public static void main(String[] args) {
        Map<PersonForCat, Cat> personCatMar = new HashMap<>();
        personCatMar.put(new PersonForCat("Omeljan"), new Cat("Barsik"));

        PersonForCat person = new PersonForCat("Vasja");
        Cat cat = new Cat("Mursik");

        System.out.println("Person Vasja heshkod = " + person.hashCode());

        personCatMar.put(person,cat);
        System.out.println(personCatMar);
        System.out.println("==========================");

        person.nane = "Havrusha";
        System.out.println(personCatMar);

        Cat catFromCollection = personCatMar.get(person);
       // System.out.println(catFromCollection.name);
        System.out.println(catFromCollection);

        System.out.println("Havrusha (old Vasja) hashcod = " + person.hashCode());

        PersonForCat vasja =  new PersonForCat("Vasja");
         System.out.println("Vasja (nev person) hashcod = " + vasja.hashCode());

         catFromCollection=   personCatMar.get(vasja);
        System.out.println(catFromCollection);

        System.out.println("==================");

        person.nane =    "Vasja";
        catFromCollection = personCatMar.get(vasja);
        System.out.println(catFromCollection);
    }
}
