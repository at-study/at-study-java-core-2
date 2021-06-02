package lections.lesson1_5_faq.friendship;

public class Application {
    public static void main(String[] args) {
        Human sergey = new Human("Сергей");
        Human valeriy = new Human("Валерий");
        Human stanislav = new Human("Станислав");
        Human mikhail = new Human("Михаил");
        Human egor = new Human("Егор");
        Human grigoriy = new Human("Григорий");
        Human aleksandr = new Human("Александр");

        sergey.addFriend(valeriy);
        stanislav.addFriend(valeriy);
        stanislav.addFriend(mikhail);
        grigoriy.addFriend(sergey);
        grigoriy.addFriend(egor);
        grigoriy.addFriend(aleksandr);
        aleksandr.addFriend(egor);
        aleksandr.addFriend(mikhail);

        System.out.println(areFriends(sergey, grigoriy));
        System.out.println(areFriends(sergey, aleksandr));
        System.out.println(areFriends(stanislav, mikhail));
        System.out.println(areFriends(mikhail, valeriy));

    }

    private static boolean areFriends(Human human1, Human human2) {
        return human1.isFriendAlreadyAdded(human2);
    }
}
