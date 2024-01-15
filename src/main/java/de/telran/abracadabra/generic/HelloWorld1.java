package de.telran.abracadabra.generic;

import java.util.Arrays;
import java.util.List;

public class HelloWorld1 {
    public static class Util {
        public static <T> T getValue(Object obj) {
            return (T) obj;
        }
    }

    public static void main(String[] args) {
        List list = Arrays.asList(2, 3);
        //List list = Arrays.asList(2, 3);
        for (Object element : list) {
           // System.out.println(Util.<Integer>getValue(element) + 1);
        }
//        for (Object element : list){
//            System.out.println(Util.<Integer>getValue(element) + 1);
//        }
    }
}
