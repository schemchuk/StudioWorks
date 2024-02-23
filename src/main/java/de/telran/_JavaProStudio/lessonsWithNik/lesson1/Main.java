package de.telran._JavaProStudio.lessonsWithNik.lesson1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MyClass {
    private String state;
   String  show() {

       return null;
   }
}

interface Animal {
    void eat();
    void run();
}
class Cat implements Animal{

    void catchMouse() {}

    @Override
    public void eat() {

    }

    @Override
    public void run() {

    }
}

class Dog implements Animal{

    @Override
    public void eat() {

    }

    @Override
    public void run() {

    }
}
class BaseClass {
    public String field1 = "BaseClass.field1";
    public void baseShow() {

    }
}
class DerivedClass extends  BaseClass  {
    public String field2 = "DerivetClass.field1";
    public void derivedSnow() {

    }
}
public class Main {

        public static void main(String[] args) {
            int value = 100;
            short shortValue = (short) value;

            final int value1 = 10;
            byte value2 = value1;

            int n = 5;
            n = ++n + n++ + n++;
            System.out.println(n);

            MyClass myClass = new MyClass();
           String result = myClass.show();

            List list1 = new ArrayList<>();
            List list2 = new LinkedList<>();
            Object o = new Object();
            list1.add(o);
            list2.add(o);
            System.out.println(list1.equals(list2));

            BaseClass baseClass = new DerivedClass();
            baseClass.baseShow();
            DerivedClass derivedClass = DerivedClass.class.cast(baseClass);
            derivedClass.derivedSnow();
            derivedClass.baseShow();

        }
    }

