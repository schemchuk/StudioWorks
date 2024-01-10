package de.telran.grogAlgorytm;

public class SetSimple {

    public static void main(String[] args) {
        final Integer i1 = 256;
        final Integer i2 = 256;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        System.out.println(i1.intValue() == i2.intValue());
        System.out.println("------------11");
        final String s1 = "Opanas Yowbysheko";
        final String s2 =  new String("Opanas Yowbysheko");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

}
