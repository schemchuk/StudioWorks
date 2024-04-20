package de.telran.stanislavsPacage.lesson14.stream;

import java.util.stream.IntStream;

public class StreamExample2 {
    public static void main(String[] args) {
        //без потока

        int[] arr = {50,60,70,80,90,100,110,120};
        int count = 0;
        for (int x : arr) {
            if (x >= 90){
                x += 10;
                count++;
                if (count > 3 ) break;
                System.out.println(x);
            }
        }
        System.out.println("===============");

        IntStream.of(50,60,70,80,90,100,110,120)
                .filter((x -> x >= 90))
                .map(x -> x + 10)
                .limit(3)
                .forEach(System.out::println);


//        List<String> list = new ArrayList<>();
//        list.add("One");
//        list.add("Two");
//        list.add("Tree");
//        list.add("Four");
//        list.add("Five");
//        list.add("Six");
//        list.add("Seven");
//        list.add("Eight");
//        list.add("Nine");
//        list.add("Ten");
//        Stream stream = list.stream();
    }
}
