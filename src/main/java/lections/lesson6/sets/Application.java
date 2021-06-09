package lections.lesson6.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Application {

    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>();
        strings.add("строка3");
        strings.add("строка1");
        strings.add("строка5");
        strings.add("строка3");

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            iterator.remove();
        }

        System.out.println(strings.size());

        for (String current : strings) {
            System.out.println(current);
        }

        Cat cat1 = new Cat("Барсик", 3);
        Cat cat2 = new Cat("Барсик", 3);

        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        System.out.println(cats.size());


    }

}
