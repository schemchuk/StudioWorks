package de.telran.javaPro.summary.work_24_04_19;


import java.util.ArrayList;
import java.util.List;

public class ExampleD1 {

    public static void main(String[] args) {
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Wasya", true));
        catList.add(new Cat("Mura", true));
        catList.add(new Cat("Prynz", false));

       feed(catList);
        System.out.println(catList);

        feedStream(catList);

        System.out.println(catList);




    }

    public static void feed(List<Cat> catList) {
        for (int i = 0; i < catList.size(); i++) {
            if (catList.get(i).isHungry()) {
                catList.get(i).setHungry(false);
            }
        }
    }

    public static void feedStream(List<Cat> catList){
        catList.stream()
                .filter(cat -> cat.isHungry)
                .forEach(s -> s.setHungry(false));
    }

    public static class Cat {
        private String name;
        private boolean isHungry;

        public Cat(String name, boolean isHungry) {
            this.name = name;
            this.isHungry = isHungry;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isHungry() {
            return isHungry;
        }

        public void setHungry(boolean hungry) {
            isHungry = hungry;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", isHungry=" + isHungry +
                    '}';
        }
    }
}
