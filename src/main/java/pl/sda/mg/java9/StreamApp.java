package pl.sda.mg.java9;

import java.util.List;
import java.util.Map;

public class StreamApp {
    public static void main(String[] args) {
        List<String> strings = List.of("1", "test", "3");
        Map<Integer, String> integerStringMap = Map.of(1, "jeden", 2, "dwa", 3, "trzy");

        System.out.println(strings);
        System.out.println(integerStringMap);

        System.out.println("=============");
        List<Integer> integers = List.of(1, 5, 3, 10, 17, 7, 9);
        System.out.println(integers);

        List<Integer> list = integers.stream()
//                .takeWhile(i -> i < 10)
                .dropWhile(i -> i < 10)
                .toList();

        System.out.println(list);

        var test = "s";

    }
}
