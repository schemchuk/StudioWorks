package de.telran.hexlet.forCodevars;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Kata {
    public static void main(String[] args) {

        System.out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B")); // Вывод: "8j8mBliB8gimjB8B8jlB"
        System.out.println(noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd")); // Вывод: "88Bifk8hB8BB8BBBB888chl8BhBfd"
        System.out.println(noSpace("8aaaaa dddd r     ")); // Вывод: "8aaaaaddddr"
        System.out.println("-----------------------------------------");

        int[] exampleArray = {1, 2, 3, 4};
        int result = grow(exampleArray);
        System.out.println(result);
        System.out.println("------------------------");


        System.out.println(remove("ASrakaS"));
    }


    public static String boolToWord(boolean b) {
        return (b == true) ? "Yes" : "No";
    }

    public static int[] digitize(long n) {
        return new StringBuilder(String.valueOf(n))
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }

    public static String accum(String s) {
//       return s.chars()
//               .mapToObj(c -> String.valueOf((char) c))
//               .map(str -> str.toUpperCase() + str.toLowerCase().repeat(str.length() - 1))
//               .collect(java.util.stream.Collectors.joining("-"));

//        return String.join("-",s.chars()
//                .mapToObj(c -> String.valueOf((char) c))
//                .map(str -> str.toUpperCase() + String.join("", Collections.nCopies(str.length() - 1, str.toLowerCase())))
//                .toArray(String[] ::new));
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            result.append(Character.toUpperCase(currentChar));

            for (int j = 0; j < i; j++) {
                result.append(Character.toLowerCase(currentChar));
            }

            if (i < s.length() - 1) {
                result.append("-");
            }
        }

        return result.toString();
    }

    static String noSpace(final String x) {
        return x.replace(" ", "");
    }

    public static int grow(int[] x){
//        int result = 1;
//        for (int i = 0; i < x.length; i++) {
//            result *= x[i];
//        }
//        return result;

        return Arrays.stream(x)
                .reduce(1,(a,b) -> a * b);

    }

    public static String remove(String str) {

//     return str.chars()
//             .skip(1)
//             .limit(str.length() -2)
//             .mapToObj(c -> (char) c)
//             .map(String::valueOf)
//             .collect(Collectors.joining());

        return  str.substring(1,str.length() - 1);
    }
}

