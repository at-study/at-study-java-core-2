package homework_solution.lesson7.task2;

import java.util.ArrayList;

public class MyArrayList<T> extends ArrayList<T> {

    @Override
    public int size() {
        System.out.println("Размер списка: " + super.size());
        return super.size();
    }

    @Override
    public boolean add(T t) {
        System.out.printf("Добавлен объект %s в список%n", t);
        return super.add(t);
    }

    @Override
    public boolean contains(Object o) {
        System.out.printf("Объект %sсодержится в списке%n", super.contains(o) ? "" : "не ");
        return super.contains(o);
    }

    @Override
    public T get(int index) {
        T object = null;
        try {
            object = super.get(index);
        } catch (IndexOutOfBoundsException ignore) {
        }
        System.out.printf("Получен объект %s из списка%n", object);
        return object;
    }

    @Override
    public void add(int index, T element) {
        int position = (index < super.size() && index >= 0) ? index : 0;
        System.out.printf("Добавлен объект %s в список на позицию %d%n", element, position);
        super.add(index, element);
    }
}
