package de.telran.javaPro.practicWithAlex.lesson_24_06_05;

public class SimpleCooperationRobot {
    public static void main(String[] args) {
        Table table = new Table();
        RobotPop robotPop = new RobotPop(table);
        RobotPut robotPut = new RobotPut(table);

        Thread threadPut = new Thread(robotPut);
        threadPut.start();
        Thread threadPop = new Thread(robotPop);
        threadPop.start();
    }


}
