package homework_solution.lesson13.task2;

@FunctionalInterface
public interface Modifier<T> {

    T modify(T source);
}
