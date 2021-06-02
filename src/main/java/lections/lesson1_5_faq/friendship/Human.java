package lections.lesson1_5_faq.friendship;

public class Human {

    private String name;
    private Human[] friends = new Human[4];

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     *
     * @param other
     */

    public void addFriend(Human other) {
        boolean isAdded = isFriendAlreadyAdded(other);
        if (!isAdded) {
            int index = getPositionForFriend();
            friends[index] = other;
            other.addFriend(this);
        }
    }

    boolean isFriendAlreadyAdded(Human human) {
        for (Human friend : friends) {
            if (friend == human) {
                return true;
            }
        }
        return false;
    }

    private int getPositionForFriend() {
        for (int i = 0; i < friends.length; i++) {
            if (friends[i] == null) {
                return i;
            }
        }
        throw new IllegalStateException("Массив друзей полный, добавить друга невозможно");
    }

}
