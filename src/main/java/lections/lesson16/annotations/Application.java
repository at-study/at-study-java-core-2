package lections.lesson16.annotations;

import java.lang.reflect.Field;
import java.util.stream.Stream;

public class Application {

    public static void main(String[] args) throws Exception {
        Flat flat = new Flat(15, 20);

        final String value = "Высота";

        Class<Flat> clazz = Flat.class;
        Field field = Stream.of(clazz.getDeclaredFields())
                .filter(f -> f.isAnnotationPresent(Dimension.class))
                .filter(f -> f.getAnnotation(Dimension.class).value().equals(value))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Нет аннотации @Dimension(value = \"" + value + "\")"));

        field.setAccessible(true);
        int height = (int) field.get(flat);
        System.out.println(height);
    }

}
