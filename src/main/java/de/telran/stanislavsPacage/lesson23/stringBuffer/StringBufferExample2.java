package de.telran.stanislavsPacage.lesson23.stringBuffer;

public class StringBufferExample2 {
    public static void main(String[] args) {
        String numbers = "0123456789";

        StringBuffer sb = new StringBuffer(numbers);

        System.out.println(sb.substring(3));
        System.out.println(sb.substring(4, 8));
        System.out.println(sb.replace(3 ,6, "ABCDE"));
        System.out.println("================");

        StringBuffer sb1 = new StringBuffer(numbers);
        System.out.println(sb1.reverse());
        System.out.println(sb1.reverse());
    }
}
