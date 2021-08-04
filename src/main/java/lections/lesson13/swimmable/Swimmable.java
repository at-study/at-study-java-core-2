package lections.lesson13.swimmable;

@FunctionalInterface
public interface Swimmable {

    void swim();

    default void swimTwice() {
        swim();
        swim();
    }
}
