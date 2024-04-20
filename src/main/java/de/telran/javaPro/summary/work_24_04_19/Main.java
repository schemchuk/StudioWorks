package de.telran.javaPro.summary.work_24_04_19;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. a^2 + b^2 + c^2
List<Integer> list = Arrays.asList(1,2,3,4,5);
       Integer sumSquare = list.stream()
                .reduce(0, (acc, element) -> acc + element * element);
        System.out.println(sumSquare);

// 2. Дан список слов "Specific" "Measurable" "Achievable" "Relevant" "Time-bound".
// С помощью стримов вывести
        //его аббревиатуру в виде S.M.A.R.T

        List<String> strings = Arrays.asList("Specific" ,"Measurable" ,"Achievable" ,"Relevant", "Time-bound");

        String smart = strings.stream()
                .map(w -> String.valueOf(w.charAt(0)) )
                .reduce((s1,s2) ->s1 + "." + s2 )
                .get();

        System.out.println(smart);



    }
}
