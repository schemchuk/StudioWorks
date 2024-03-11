package de.telran.stanislavsPacage.lesson13.anonimus;

public class ErrorMonitoringModule implements MonitoringSystem{

    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг ошибок запущен!");
    }
}
