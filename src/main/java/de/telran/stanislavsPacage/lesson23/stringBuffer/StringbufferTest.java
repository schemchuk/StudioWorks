package de.telran.stanislavsPacage.lesson23.stringBuffer;

public class StringbufferTest {
    public static void main(String[] args) {
        String str = "";
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 200_000; i++) {
            str = str + i;
        }
        long endTime = System.currentTimeMillis();

        System.out.println("OperationTime is " + (endTime - startTime));

        StringBuffer sb = new StringBuffer();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 200_000; i++) {
            sb.append(i);
        }
        endTime = System.currentTimeMillis();

        System.out.println("OperationTime is " + (endTime - startTime));
    }
}
