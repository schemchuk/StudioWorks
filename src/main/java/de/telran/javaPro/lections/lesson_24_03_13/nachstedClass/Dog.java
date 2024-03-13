package de.telran.javaPro.lections.lesson_24_03_13.nachstedClass;

public class Dog {
    private  String name;

    public Dog(String name) {
        this.name = name;
    }

    public static class  DogFut{
        private String foodName;

        public DogFut(String foodName) {
            this.foodName = foodName;
        }

        @Override
        public String toString() {
            return "DogFut{" +
                    "foodName='" + foodName + '\'' +
                    '}';
        }
    }

}
