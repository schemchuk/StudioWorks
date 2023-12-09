package de.telran._JavaProStudio.module1.lesson3.statiks;

 public class DayOfWeek {
    private  String title;

    private DayOfWeek(String title) {
        this.title = title;
    }

    public static DayOfWeek MONDAY = new DayOfWeek("Ponedilok");

    @Override
    public String toString() {
        return "DayOfWeek{}";
    }
}
