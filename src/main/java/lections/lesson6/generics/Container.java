package lections.lesson6.generics;

public class Container<T> {

    private T value;

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
