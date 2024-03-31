package de.telran.stanislavsPacage.lesson11.tree.tree2;

public class Student implements Comparable<Student>{
    private int age;
    private String name;


    @Override
    public int compareTo(Student o) {
        int compareResult = o.age - age;
        if (compareResult ==0) {
            compareResult = o.name.compareTo(name);

        }
        return compareResult;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
