package de.telran.abracadabra.generic;
import java.util.*;
public class GenericClass {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Heloo Worldl");
        String data = list.get(0);
        System.out.println(data);
    }
}
