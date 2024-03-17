package de.telran.stanislavsPacage.lesson8.hacsCodeExample;

public class HashExample2 {
    public static void main(String[] args) {

        Person person1 = new Person("Vasya", 25);
        Person person2 = new Person("Vasya", 25);

        System.out.println(person1.hashCode());

        System.out.println(person2.hashCode());





        Person person3 = new Person("Opanas", 24);


    }
}
