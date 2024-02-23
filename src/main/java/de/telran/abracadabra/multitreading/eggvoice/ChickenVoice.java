package de.telran.abracadabra.multitreading.eggvoice;

 class EggVoice extends Thread {
     @Override
     public void run() {
         for (int i = 0; i < 5; i++) {
             try {
                 sleep(1);
             } catch (InterruptedException e) {
             }
             ;
             System.out.println("яйцо!");
         }
     }
 }

    public class ChickenVoice {
        static EggVoice mAnotherOption;


        public static void main(String[] args) {
            mAnotherOption = new EggVoice();
            System.out.println("Спор начат...");
            mAnotherOption.start();
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("курица!");
            }
            if (mAnotherOption.isAlive()) {
                try {
                    mAnotherOption.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Первым появилось яйцо!");
            } else {
                System.out.println("Первой появилась курица!");
            }
            System.out.println("Спор закончен!");
        }
    }

