package de.telran.stanislavsPacage.lesson4.nonPrimitive;

public class NonPrimitiveExample {
    public static void main(String[] args) {
        Integer x = 5;
        Integer x1 = new Integer(5);
        Integer x2 = x.intValue();

        //int x1 = x;

//        Integer a = null;
//        Integer b = 10;
//        Integer c = a++;

        Integer a = 1;
        Integer b = 1;
        Integer c = new Integer(1);

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        Integer d = 2023;
        Integer f = 2023;

        System.out.println(d.equals(f));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        String str = "10.5";

        double strNumber = Double.parseDouble(str);
        strNumber++;
        System.out.println(++strNumber);



    }
}
