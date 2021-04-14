package homework_solution.lesson3.task4;

public class Application {

    public static void main(String[] args) {
        Human sergey = new Human("Сергей");
        Human valeriy = new Human("Валерий");
        Human mikhail = new Human("Михаил");
        Human stanislav = new Human("Станислав");
        Human egor = new Human("Егор");
        Human grigoriy = new Human("Григорий");
        Human alexander = new Human("Александр");

        sergey.addFriend(valeriy);
        sergey.addFriend(grigoriy);
        stanislav.addFriend(valeriy);
        stanislav.addFriend(mikhail);
        egor.addFriend(alexander);
        egor.addFriend(grigoriy);
        alexander.addFriend(grigoriy);
        alexander.addFriend(mikhail);

        System.out.println(areFriends(sergey, grigoriy));
        System.out.println(areFriends(sergey, alexander));
        System.out.println(areFriends(stanislav, mikhail));
        System.out.println(areFriends(mikhail, valeriy));
    }

    static boolean areFriends(Human first, Human second) {
        for (Human firstFriend : first.friends)
            if (firstFriend == second) return true;
        return false;
    }

}
