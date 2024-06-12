package de.telran.javaPro.practicWithAlex.lesson_24_06_05;

public class RobotPop implements Runnable{
    private Table table;

    public RobotPop(Table table) {
        this.table = table;
    }

    @Override
    public void run() {

        table.pop();
        String box = table.pop();
        System.out.println(Thread.currentThread().getName() + " takes a box -" + box);
    }
}
