package de.telran.extraHomeWorke.exepscens.exception;

public class MyExceptionDemo {
    public static void main(String[] args) {
        Exception exception1 = new MyException();
        Exception exception2 = new MyException("Program has sraka");
        System.out.printf("exception1: %s\n", exception1.getMessage());
        System.out.printf("-----------\n");
        System.out.printf("exception2: %s\n", exception2.getMessage());


        try {
            throw new MyException("Chren wam");
        }catch (MyException e){
            e.printStackTrace();
        }
    }

    
}
