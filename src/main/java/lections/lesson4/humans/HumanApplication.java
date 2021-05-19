package lections.lesson4.humans;

public class HumanApplication {

    public static void main(String[] args) {
        Human ivan = new Human();
        ivan.setName("Иван");
        ivan.setAge(25);

        System.out.println(ivan.getName());
        System.out.println(ivan.getAge());

        Cat cat = Cat.getRandomCat();
        cat.setName("Мурзик"); // cat.name = "Мурзик"
        cat.setAge(15);
    }

}
