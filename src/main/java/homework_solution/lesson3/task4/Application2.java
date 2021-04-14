package homework_solution.lesson3.task4;

public class Application2 {

    public static void main(String[] args) {
        Human sergey = new Human("Сергей");
        Human valeriy = new Human("Валерий");
        Human mikhail = new Human("Михаил");
        Human stanislav = new Human("Станислав");
        Human egor = new Human("Егор");
        Human grigoriy = new Human("Григорий");
        Human alexander = new Human("Александр");

        sergey.addNewFriend(valeriy);
        sergey.addNewFriend(grigoriy);
        stanislav.addNewFriend(valeriy);
        stanislav.addNewFriend(mikhail);
        egor.addNewFriend(alexander);
        egor.addNewFriend(grigoriy);
        alexander.addNewFriend(grigoriy);
        alexander.addNewFriend(mikhail);

        System.out.println(areFriends(sergey, grigoriy));
        System.out.println(areFriends(sergey, alexander));
        System.out.println(areFriends(stanislav, mikhail));
        System.out.println(areFriends(mikhail, valeriy));
    }

    static boolean areFriends(Human first, Human second) {
        for (Human firstFriend : first.newFriends)
            if (firstFriend == second) return true;
        return false;
    }

}
