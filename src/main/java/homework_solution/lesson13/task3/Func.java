package homework_solution.lesson13.task3;

@FunctionalInterface
public interface Func<K, V> {

    V execute(K argument);

}
