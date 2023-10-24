package pl.sda.mg.java9;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalWithValue = Optional.of("Wartość jest obecna");
        Optional<String> optionalEmpty = Optional.empty();

//        optionalWithValue.ifPresent(value -> System.out.println(value));

        optionalEmpty.ifPresentOrElse(value -> System.out.println("Wartość: " + value),
                () -> System.out.println("Brak wartości") );


        Optional<String> optional1 = optionalWithValue.or(() -> Optional.of("Nowa wartośc gdy brak"));
        Optional<String> optional2 = optionalEmpty.or(() -> Optional.of("Nowa wartośc gdy brak"));

        System.out.println(optional1.get());
        System.out.println(optional2.get());
    }
}
