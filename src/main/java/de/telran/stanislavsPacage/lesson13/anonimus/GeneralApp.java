package de.telran.stanislavsPacage.lesson13.anonimus;

public class GeneralApp {
    public static void main(String[] args) {
        GenerallIndicatorsMonitoringModule generallModule = new GenerallIndicatorsMonitoringModule();
        ErrorMonitoringModule errorMonitoringModule = new ErrorMonitoringModule();
        SecurityMonitoringModule securityMonitoringModule = new SecurityMonitoringModule();

        generallModule.startMonitoring();
        errorMonitoringModule.startMonitoring();
        securityMonitoringModule.startMonitoring();
    }
}
