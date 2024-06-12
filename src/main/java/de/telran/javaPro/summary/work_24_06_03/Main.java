package de.telran.javaPro.summary.work_24_06_03;

public class Main {
    /**
     * 3*. Запустите в 3 потока просчет количества всех простых чисел в интервале от 2 до 1_000_000.
     * После проверки одного числа, усыпите поток на 10 млс
     * Через 5 секунд завершите принудительно выполнение 1-го потока командой из главного.
     * Через 10 секунд завершите и 2-й поток.
     * Через 15 секунд - 3-й поток.
     * Время подкорректируйте под скорость своего компьютера.
     */
    public static void main(String[] args) {
        // Создаем анонимный класс потока
        Thread t = new Thread(()->{
            for (int  j= 0; j < 10; j++) {
                System.out.println(Thread.currentThread().getName()+" работает "+j+" раз");
                try {
                    System.out.println(Thread.currentThread().getName()+" сам засыпает "+j+" раз");
                    Thread.sleep(2000); // засыпает на 2 сек
                    System.out.println(Thread.currentThread().getName()+" сам просыпается "+j+" раз");

                    if(Thread.interrupted()) {// проверка isInterrupted
                        System.out.println("Закрываем сами поток по просьбе, выполнялся "+j+" раз.");
                        // своя логика
                        return; // завершаем работу потока, если необходимо!
                    }

                } catch (InterruptedException e) {
                    System.out.println("InterruptedException - проснулся принудительно "+j+" шаг.");
                    // своя логика
                    return; // завершаем работу потока, если необходимо!
//                    throw new RuntimeException(e);
                }
            }
        });
    }
}
