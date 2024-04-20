package de.telran.javaPro.lections.lesson_24_04_08.test.doctorQuele;

public class Patient implements Comparable<Patient>{
    private String name;
    private Double timeSlot;

    public Patient(String name, Double timeSlot) {
        this.name = name;
        this.timeSlot = timeSlot;
    }

    public String getName() {
        return name;
    }

    public Double getTimeSlot() {
        return timeSlot;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", timeSlot=" + timeSlot +
                '}';
    }

    @Override
    public int compareTo(Patient o) {
        return Double.compare(this.timeSlot,o.timeSlot);
    }
}
