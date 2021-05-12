package lections.lesson3;

public class CatApplication {

    public static void main(String[] args) {

        Cat.printCatCount();

        Cat cat = new Cat("Барсик", 4, 2);
        Cat cat2 = new Cat("Мурзик", 3, 5);

        cat.voice();
        cat2.voice();

        Cat.printCatCount();

        cat.count++;

        System.out.println(cat2.count);

        Cat generatedCat = Cat.generateYoungCat();
        Cat generatedCat2 = Cat.generateYoungCat();
        Cat generatedCat3 = Cat.generateYoungCat();
        System.out.println(generatedCat.name);
        System.out.println(generatedCat.age);
        System.out.println(generatedCat.weight);

        System.out.println();

        Cat[] randomCats = Cat.generateCats(10);
        for (Cat current : randomCats) {
            System.out.printf("Кот с именем: %s, возраст: %d, вес: %d%n", current.name, current.age, current.weight);
        }
    }

}
