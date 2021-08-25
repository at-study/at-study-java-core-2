package lections.lesson16.cats;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.stream.Stream;

public class CatApplication {

    public static void main(String[] args) throws Exception {
        Class<Cat> clazz = Cat.class;

        Constructor<Cat> constructor = clazz.getDeclaredConstructor(String.class, Integer.TYPE, Integer.TYPE);
        constructor.setAccessible(true);
        Cat cat = constructor.newInstance("Барсик", 5, 4);

        Method getNameMethod = clazz.getDeclaredMethod("getName");
        getNameMethod.setAccessible(true);
        String name = (String) getNameMethod.invoke(cat);
        System.out.println(name);


        Stream.of(clazz.getDeclaredFields())
                .filter(field -> field.getType().equals(Integer.TYPE))
                .peek(f -> f.setAccessible(true))
                .forEach(f -> {
                    try {
                        f.set(cat, 10);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                });


        Stream.of(clazz.getDeclaredMethods())
                .filter(m -> m.getReturnType().equals(Integer.TYPE))
                .sorted(Comparator.comparing(Method::getName))
                .peek(m -> m.setAccessible(true))
                .map(m -> {
                    try {
                        return m.invoke(cat);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                })
                .forEach(System.out::println);


    }

}
