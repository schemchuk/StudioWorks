package de.telran.stanislavsPacage.lesson10.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonRepositoryDemoWithOptional {
    public static void main(String[] args) {
        Map<Integer,Person> repository = new HashMap<>();

        Person person1 = new Person("John");
        Person person2 = new Person(null);


        repository.put(1,person1);
        repository.put(2,person2);


        PersonRepository personRepository = new PersonRepository(repository);

        Optional<Person> optionalPerson = personRepository.findById(2);
        System.out.println(optionalPerson);

        if (optionalPerson.isPresent()){
            Person tempPerson = optionalPerson.get();
            String name = tempPerson.getName();
            if (name != null){
                System.out.println("Длина имени клиента " + name.length());
            } else {
                System.out.println("Name is null");
            }
        }else {
            System.out.println("This collection element does't exist");
        }
    }
}
