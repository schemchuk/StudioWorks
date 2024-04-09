package de.telran.extraHomeWorke.collection.students;

import java.util.Map;

public class Student  {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades;

    public Student(String name, String group, int course, Map<String, Integer> grades){
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Integer> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }


//    @Override
//    public int compareTo(Student o) {
//       int nameComparison = this.name.compareTo(o.name);
//       if (nameComparison != 0){
//           return nameComparison;
//       }
//
//       int groupComparison = this.group.compareTo(o.group);
//       if (groupComparison != 0){
//           return groupComparison;
//       }
//
//       int courseComparison = Integer.compare(this.course, o.course);
//       if (courseComparison != 0){
//           return courseComparison;
//       }
//
//       int grageComparison = Integer.compare(this.grades.size(),o.grades.size());
//       if (grageComparison != 0);{
//           return grageComparison;
//        }
//       // return 0;
//    }
}
