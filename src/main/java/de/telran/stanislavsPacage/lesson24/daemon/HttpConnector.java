package de.telran.stanislavsPacage.lesson24.daemon;

public class HttpConnector implements Runnable{
    @Override
    public void run() {
        while (true) {
            // делается запрос по http-протоколу по адресу ip
            // получаем ответ
            // если ответ не пустой то положили инфо в коллекцию
            // и ждем 5 минут
            try {
                Thread.sleep(300_000);
            } catch (InterruptedException e) {}
        }
    }
}
