package de.telran.javaPro.summary.work_24_04_19;

import java.util.stream.IntStream;

public class ExampleD5 {
    public static void main(String[] args) {
        String[] data = {"Three","Four","One","Two","Five"};
        String elenent = "Two";
        System.out.println(findIndex(data,elenent));
        System.out.println(findIndexStream(data,elenent));
    }


    public static int findIndex(String[] data, String element) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public static int findIndexStream(String[] data, String element){

       return IntStream.range(0,data.length)
               .filter(i -> data[i].equals(element))
                .findFirst().orElse(-1);

    }
}
