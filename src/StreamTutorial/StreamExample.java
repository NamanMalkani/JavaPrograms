package StreamTutorial;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        System.out.println(IntStream.range(1,5).sum());

        Stream.of("Ava","Madhav","Hitoshi").sorted().findFirst().ifPresent(System.out::println);

        //Stream from an array, sort , filter and print
        String[] names = {"Naman", "Kaustubhi", "Faiz", "Chetanya", "Jatin", "Saumya"};
        Arrays.stream(names).filter(x -> x.startsWith("S")).sorted().forEach(System.out::println);

        int[] numbers = {3, 6, 523, 523, 3,552, 52,525, 5,3, 5};
        Arrays.stream(numbers).filter(x -> x % 2 == 0).sorted().forEach(System.out::println);

    }
}
