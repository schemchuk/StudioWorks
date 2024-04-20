package de.telran.javaPro.summary.work_24_04_19;

import java.util.List;

public class ExampleD3 {
    public static void main(String[] args) {

        List<String> list = List.of("Three","Four","One","Two","Five");
        String word = null;
        for (String t : list){
            if (t.length() == 3) {
                word = t;
                break;
            }
        }
        System.out.println(word);

        String listStream = list.stream()
                .filter(s -> s.length() == 3)
                        .findFirst()
                                .orElse(null);


        System.out.println(listStream);
    }
}
