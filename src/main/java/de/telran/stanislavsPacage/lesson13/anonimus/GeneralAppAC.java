package de.telran.stanislavsPacage.lesson13.anonimus;

public class GeneralAppAC {
    private static  int currentErrorsCount = 23;
    public static void main(String[] args) {
        GeneralAppAC generalAppAC = new GeneralAppAC();
        generalAppAC.monitoring();
    }
public  void monitoring() {
        MonitoringSystem generalModule = new MonitoringSystem() {

            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг общих показателей запущен!");
            }
        };

        MonitoringSystem errorModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг ошибок запущен!");
                System.out.println(currentErrorsCount);
            }
//            public void sayHello() {
//                System.out.println("Hujlo");
//            }
        };

        MonitoringSystem sekurityModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг бузопасности запущен!");
            }
        };

       generalModule.startMonitoring();
       errorModule.startMonitoring();
       sekurityModule.startMonitoring();

    }
}
