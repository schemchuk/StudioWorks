package de.telran.stanislavsPacage.lesson14.stream;

import java.util.Arrays;
import java.util.List;

public class StreamExample5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("BigBen", "BigBob","Big","Ben","Big Ben");

        System.out.println(list.stream().filter(s -> s.equals("Big")).count());

        List<String> list2 = Arrays.asList("a1", "b5", "a2", "b4");
        System.out.println(list2.stream().min((str1,str2) -> str1.compareTo(str2)).get());

        List<String> list3 = Arrays.asList("a1", "b5", "a2", "b4", "c1" , "a1" , "b5");

        List<String> result3 = list3.stream()
                .sorted()
                .distinct()
                .toList();

        System.out.println(result3);



        List<String> list4 = Arrays.asList("a1", "b5", "a2", "b4", "c1" , "a1" , "b5");

        List<String> result4 = list3.stream()
                .sorted((o1,o2) -> (-1) * (o1.compareTo(o2)))
                //      .sorted((o1,o2) -> (o2.compareTo(o1)))   - аналогично
                //      .sorted(Comparator.reverseOrder())       - аналогично
                .distinct()
                .toList();

        System.out.println(result4);
    }
}
