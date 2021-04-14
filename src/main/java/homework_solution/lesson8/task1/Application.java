package homework_solution.lesson8.task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            persons.add(new Person());
        }
        Set<Person> duplicates = new HashSet<>();
        for (int i = 0; i < persons.size(); i++) {
            for (int j = i + 1; j < persons.size(); j++) {
                Person first = persons.get(i);
                Person second = persons.get(j);
                if (first.equals(second)) duplicates.add(first);
            }
        }

        Iterator<Person> iterator = duplicates.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Set<Person> personSet = new HashSet<>();
        for (int i = 0; i < 2000; i++) {
            personSet.add(new Person());
        }
        System.out.println("Количество записей в множестве: " + personSet.size());
    }
}
