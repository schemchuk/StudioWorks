package de.telran.stanislavsPacage.lesson4.statickAndFinal;

public class FinalVariable {
    private final static String SOMESTRING = "something";

    public static void print(final double data){

        final String str;

        str = "someString";

        //str = "dfxbhxdnb";

        // data = 5.6;

        System.out.println(str);
        System.out.println(data);
        System.out.println(SOMESTRING);
    }

    public static void main(String[] args) {
        print(3);
    }
}
