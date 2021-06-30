package lections.lesson9.to_string;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 3, 4);
        Cat cat1 = new Cat("Мурзик", 5, 2);
        Cat cat2 = new Cat("Леопольд", 4, 3);

        List<Cat> cats = new CatArrayList();
        cats.add(cat);
        cats.add(cat1);
        cats.add(cat2);

        System.out.println(cats);
    }

}
