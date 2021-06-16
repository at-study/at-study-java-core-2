package lections.lesson7.tasks;

// Сделать свою реализацию List.
// Поведение должно быть таким же, как и у LinkedList.
// Использовать наш List можно только с наследниками Animal
// При добавлении элемента в список должен вызываться метод voice(); и элемент должен добавляться в список
// Аналогично при получении элемента из списка

import java.util.LinkedList;

import lections.lesson7.inheritance.animals.Animal;

public class AnimalList<T extends Animal> extends LinkedList<T> {

    @Override
    public boolean add(T e) {
        e.voice();
        return super.add(e);
    }

    @Override
    public void add(int index, T element) {
        element.voice();
        super.add(index, element);
    }

    @Override
    public T get(int index) {
        T element = super.get(index);
        element.voice();
        return element;
    }
}
