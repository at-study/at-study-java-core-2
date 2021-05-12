package lections.lesson3;

public class Application {

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.name);
        System.out.println(human.age);

        Human sergey = new Human(10, "Сергей");
        System.out.println(sergey.name);
        System.out.println(sergey.age);

        Human grigoriy = new Human(15, "Григорий");
        grigoriy = null;


    }

}
