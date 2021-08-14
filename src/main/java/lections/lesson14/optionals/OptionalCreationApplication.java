package lections.lesson14.optionals;

import java.util.Optional;
import java.util.Random;

public class OptionalCreationApplication {

    public static void main(String[] args) {

        Optional<String> sOptional = Optional.of("123");
        Optional<String> sOptional2 = Optional.ofNullable(null);
        Optional<String> sOptional3 = Optional.empty();


        Optional<Integer> integerOptional = Optional.of(100);

        Optional<Integer> filteredIntegerOptional = integerOptional.filter(i -> i > 50);
        Optional<Integer> filteredIntegerOptional2 = integerOptional.filter(i -> i < 50);

        Optional<String> mappedIntegerOptional =
                integerOptional.map(i -> String.valueOf(i));
        Optional<String> flatMappedIntegerOptional =
                integerOptional.flatMap(i -> Optional.of(i.toString()));


        boolean isPresent = integerOptional.isPresent();

        integerOptional.ifPresent(i -> System.out.println(i));


        Integer internal1 = integerOptional.get();
        Integer internal2 = integerOptional.orElse(new Random().nextInt(100));
        Integer internal3 = integerOptional.orElseGet(() -> new Random().nextInt(100));
        Integer internal4 = integerOptional.orElseThrow(() -> new IllegalStateException("Внутри Optional находится null"));
    }

}
