package lections.lesson9.to_string;

public class Bird {

    private int speed;
    private boolean isFlyable;
    private int age;

    public Bird(int speed, boolean isFlyable, int age) {
        this.speed = speed;
        this.isFlyable = isFlyable;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Bird bird = (Bird) o;

        if (speed != bird.speed) {
            return false;
        }
        if (isFlyable != bird.isFlyable) {
            return false;
        }
        return age == bird.age;
    }

    @Override
    public int hashCode() {
        int result = speed;
        result = 31 * result + (isFlyable ? 1 : 0);
        result = 31 * result + age;
        return result;
    }
}
