package de.telran.abracadabra.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class SimpleStreams {
    public static void main(String[] args) {
        List<String> list = Arrays.stream(args)
                .filter(s -> s.length() <= 2)
                .collect(Collectors.toList());

        IntStream.of(120,410,85,32,314,12)
                .filter(x -> x < 300)
                .map(x -> x + 11)
                .limit(3)
                .forEach(System.out::println);
        System.out.println("--------------------------");


//        Stream<String> stream = list.stream();
//        stream.forEach((System.out::println));
//        stream.filter(s -> s.contains("Stream API"));
//        stream.forEach(System.out::println);

//        list.parallelStream()
//                .filter(x -> x > 10)
//                .map(x -> x * 2)
//                .collect(Collectors.toList());
//
//        IntStream.range(0, 10)
//                .parallel()
//                .map(x -> x * 10)
//                .sum();

//        final List<Integer> ints = new ArrayList<>();
//        IntStream.range(0, 1000000)
//                .parallel()final List<Integer> ints = new ArrayList<>();
//IntStream.range(0, 1000000)
//    .parallel()
//    .forEach(i -> ints.add(i));
//System.out.println(ints.size());
//                .forEach(i -> ints.add(i));
//        System.out.println(ints.size());

//        Stream.of(1,2,3)
//                .forEach(System.out::print);
        System.out.println("----------------------------");

        String str  = Math.random() > 0.5 ? "I'm feeding lucky" : null;
        Stream.ofNullable(str)
                .forEach(System.out::println);

        System.out.println("------------------");

        Stream.generate(() -> 6)
                .limit(6)
                .forEach(System.out::println);
        System.out.println("------------------------------");

        Stream.iterate(2,x -> x +6)
                .limit(6)
                .forEach(System.out::println);
        Stream.iterate(1, x -> x * 2)
                .limit(6)
                .forEach(System.out::println);
        System.out.println("--------------------------------");

        Stream.iterate(2, x -> x < 25, x-> x +6)
                .forEach(System.out::println);
        System.out.println("------------");

        Stream.concat(
                Stream.of(1,2,3),
                Stream.of(4,5,6))
                        .forEach(System.out::println);
        System.out.println("-------------");
       Stream.concat(
               Stream.of(10),
               Stream.of(4,16)
       )
               .forEach(System.out::println);
        System.out.println("----------------");

        Stream.Builder<Integer> streamBuilder = Stream.<Integer>builder()
                .add(0)
                .add(1);
        for (int i = 2; i <= 8; i += 2) {
            streamBuilder.accept(i);
        }
        streamBuilder
                .add(9)
                .add(11)
                .add(13)
                .build()
                .forEach(System.out::println);
        System.out.println("---------------------");

        IntStream.range(0,11)
                .forEach(System.out::println);
        LongStream.range((int) -10L, (int) - 5L)
                .forEach(System.out::println);
        System.out.println("----------------------------");
        
        IntStream.rangeClosed(0,5)
                .forEach(System.out::println);

        LongStream.range(-8L, -5L)
                .forEach(System.out::println);

        System.out.println("-------------Filter__________________--");

        Stream.of(1,2,3)
                .filter(x -> x == 10)
                .forEach(System.out::println);

        Stream.of(120,410,85,32,314,12)
                .filter(x -> x > 100)
                .forEach(System.out::println);

        IntStream.rangeClosed(2,9)
                .filter(x -> x % 3 == 0)
                .forEach(System.out::println);
        System.out.println("-------map(Function mapper)--------");

        Stream.of("3", "4", "5")
            .map(Integer::parseInt)
            .map(x -> x + 10)
            .forEach(System.out::println);

        Stream.of(123, 345, 234)
                .map(x -> x + 11)
                .forEach(System.out::println);

        Stream.of("10","11","32")
                .map(x -> Integer.parseInt(x,16))
                .forEach(System.out::println);
        System.out.println("-------flatMap(Function<T, Stream<R>> mapper)-------");

        Stream.of(2,3,0,1,3)
                .flatMapToInt(x -> IntStream.range(0,x))
                .forEach(System.out::println);
        System.out.println("-------------------");
        Stream.of(1,2,3,4,5,6)
                .flatMap(x -> {
                    switch (x % 3){
                        case 0:
                            return Stream.of(x, x * x, x * x * 2) ;
                        case 1:
                            return Stream.of(x);
                        case 2:
                        default:
                            return Stream.empty();
                    }
                })
                .forEach(System.out::println);

        
   }
}
