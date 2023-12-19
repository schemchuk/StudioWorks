package de.telran._JavaProStudio.module3.lesson2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class SimpleManyFunction {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tusik", 10, "Dvorterer");
        dog1.printCallName("Fas");
        dog1.printAge(("How old ? "));
        dog1.getPrice("Omeljan ");

        MyFuncInterface int1 = new MyFuncInterface() {
            @Override
            public void printColl(Dog dog, String call) {
                System.out.println(call + " " + dog.getName());

            }
        };

        int1.printColl(dog1, "Fas");

        MyFuncInterface int2 = (dog, call) -> System.out.println(call + " " + dog.getName());
        int2.printColl(dog1, "Fas");

        MyFuncInterface int3 = (dog, call) -> System.out.println(call + " " + dog.getAge());
        int3.printColl(dog1,"How old? ");
        int3 = (dog, call) -> System.out.println(call + " " + dog.getBreed());
        int3.printColl(dog1,"Which breed? ");

        int3 =  (dog, call) ->  {
               int price =  dog.getAge() * 10;
            System.out.println(call + " can sell " + dog.getName() + " of " + price + "euro");
        };
        int3.printColl(dog1, "Havrusha ");

        sendEmail(dog1, "Anton", int3);
        sendEmail(dog1,"Fas", int2);
    }


    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    static class Dog{
        private  String name;
        private int age;
        private String breed;

    public void printCallName (String call) {
        System.out.println(call + " " + name);
    }
        public void printAge(String call) {System.out.println(call + " " + age);}
        public void getBreed(String call) {
            System.out.println(call + " " + name);
        }

        public void  getPrice(String namePeople){
        int price = age * 10;
                System.out.println(namePeople + "can sell " + name + " of " + price);
        } ;
    }
    interface   MyFuncInterface {
        void  printColl(Dog dog,String call);
    }

   static void  sendEmail(Dog dog , String message, MyFuncInterface body) {
        System.out.println("We send of post mail: ");
        body.printColl(dog, message);
    }
  }

