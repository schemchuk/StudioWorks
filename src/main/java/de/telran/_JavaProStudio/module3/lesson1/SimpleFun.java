package de.telran._JavaProStudio.module3.lesson1;


public class SimpleFun {
    public static void main(String[] args) {
        simpleDoWork(new SimpleFunClass());


        simpleDoWork((new SimpleFunInterface() {
            @Override
            public void doWork() {
                System.out.println(" Anonimus: doWork");
            }
        }));
        SimpleFunInterface siIN = new SimpleFunClass();
        simpleDoWork(siIN);
        simpleDoWork(() -> System.out.println("Lambda dowork"));
    }


    public static void simpleDoWork(SimpleFunInterface si) {
        si.doWork();
    }
}

    class SimpleFunClass implements SimpleFunInterface {
        @Override
        public void doWork() {
            System.out.println(" SimpleFunClass: doWork");
        }
    }


