package de.telran.stanislavsPacage.lesson1.students.entity;

public class Student extends Person{
    String group;

    public Student(String name,String group) {
        super(name);
        this.group = group;
    }
    @Override
    public void greeting(){
       super.greeting();
        System.out.println("  I am a student! My group is " + group);
    }

    public void  say(){
        System.out.println(name + " is sayning pight now");
    }
}
