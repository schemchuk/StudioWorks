package de.telran.javaPro.practicWithAlex.lesson_24_06_05;

public class RobotPut implements Runnable{
   private Table table;

    public RobotPut(Table table) {
        this.table = table;
    }


    @Override
    public void run() {
//
//        table.put(UUID.randomUUID().toString());
//        System.out.println(Thread.currentThread().getName() + " puts UUID- " + id);
    }
}
