package de.telran.stanislavsPacage.lesson13.anonimus;

public class SecurityMonitoringModule implements MonitoringSystem{

    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг бузопасности запущен!");
    }
}
