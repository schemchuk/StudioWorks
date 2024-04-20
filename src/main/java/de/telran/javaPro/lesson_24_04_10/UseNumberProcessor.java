package de.telran.javaPro.lesson_24_04_10;

import java.util.function.Consumer;

public class UseNumberProcessor {
   public static void main(String[] args) {
//       Function<Integer, String> numberProcessorFunktion = (s) -> {
//           String out = "---" + s + "---";
//           return out;
//       };
//      String result = numberProcessorFunktion.apply(123);
//       System.out.println(result);

       Consumer<Integer> printNumber = (integer -> System.out.println("---" + integer + "---"));
       printNumber.accept(123);
   }


}
