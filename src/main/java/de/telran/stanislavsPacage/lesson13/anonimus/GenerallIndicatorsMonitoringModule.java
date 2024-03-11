package de.telran.stanislavsPacage.lesson13.anonimus;

public class GenerallIndicatorsMonitoringModule implements MonitoringSystem{

    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг общих показателей запущен!");
    }
}
