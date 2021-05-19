package lections.lesson4.humans;

public class CatApplication {

    public static void main(String[] args) {
        Cat murzik = new Cat();
        murzik.setName("Мурзик");
        murzik.setAge(12);

        Cat barsik = new Cat()
                .setName("Барсик")
                .setAge(13);

        System.out.printf(
                "Кот с именем %s и возрастом %d",
                barsik.getName(),
                barsik.getAge()
        );
    }

}
