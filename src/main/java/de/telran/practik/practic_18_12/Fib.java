package de.telran.practik.practic_18_12;

import java.util.Optional;
import java.util.stream.Stream;

public class Fib {

    public static long fibLOOP(final int idx) {
        if (idx < 0) {
            throw new IllegalArgumentException();
        }
            long fib1 = -1l;
            long fib2 = 1l;

            for (int i = 0; i < idx; i++) {
                long result = fib1 + fib2;
                fib1 = fib2;
                fib2 = result;
            }
            return fib2;
        }

        public static long fibREC(final int idx){
            if (idx < 0) {
                throw new IllegalArgumentException();
            }
            return idx == 1 || idx == 2 ? 1l : fibREC(idx - 2) + fibREC(idx - 1);
        }

        public static Optional<Long> fibSTREAM(final int idx){
            var result =
                    Stream.iterate(new long[]{0,1},arr -> new long[]{arr[1],arr[0] + arr[1]})
                            .limit(idx + 1)
                            .map(y -> y[0])
                            .max(Long::compareTo);
        return result;
        }


    public static void main(String[] args) {
        int idx = 20;
      long startTimeLoop = System.currentTimeMillis();
      fibLOOP(idx);
        System.out.println("LOOP : " + (System.currentTimeMillis() - startTimeLoop));

        long startTimeREC = System.currentTimeMillis();
        fibREC(idx);
        System.out.println("REC : " + (System.currentTimeMillis() - startTimeREC));

        long startTimeSTREAM = System.currentTimeMillis();
        fibSTREAM(idx);

        System.out.println("STREAM : " + (System.currentTimeMillis() - startTimeSTREAM));
//    public static  int fibLOOP(final int idx){
//        if (idx <= 1) {
//            return idx;
//        }
//           int prev = 0;
//            int current = 1;
//
//            for  (int i = 2; i < idx; i++) {
//                int next = prev + current;
//                prev = current;
//                current = next;
//            }
//        return current;
    }
}
