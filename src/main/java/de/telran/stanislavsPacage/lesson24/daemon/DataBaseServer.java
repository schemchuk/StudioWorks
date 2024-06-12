package de.telran.stanislavsPacage.lesson24.daemon;

public class DataBaseServer implements Runnable{
    @Override
    public void run() {

        while (true) {
            //вносим изменение в базу данных
            //ждем 10 минут
            try {
                Thread.sleep(600_000);
            }catch (InterruptedException e){
            }
        }
    }
}
