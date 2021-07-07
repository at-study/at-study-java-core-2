package lections.lesson10.cat_task;

import lections.lesson9.tasks.xml_task.Cat;

public class CatApplication {

    public static void main(String[] args) {
        Cat cat = CatFileOperations.readCat();
        System.out.println(cat);

        Cat cat1 = new Cat("Мурзик", 12);
        CatFileOperations.saveCat(cat1);

        // BufferedReader, BufferedWriter при работе с файлами.
    }
}
