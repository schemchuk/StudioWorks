package de.telran.stanislavsPacage.lesson24.daemon;

public class ServiceUtil {
    public static void main(String[] args) {
        DataBaseServer dbc = new DataBaseServer();
        Thread thread1 = new Thread(dbc);

        thread1.setDaemon(true);
        thread1.start();

        HttpConnector hc = new HttpConnector();
        Thread thread2 = new Thread(hc);

        thread2.setDaemon(true);
        thread2.start();

        // выполняется код
        //
        //
        //
        // завершение работы метода и приложения
    }
}
