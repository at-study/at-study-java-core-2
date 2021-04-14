package homework_solution.lesson7.task2;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Integer> ints = new MyArrayList<>();
        ints.add(5);
        ints.add(6);
        ints.add(0, 4);
        ints.contains(6);
        ints.contains(15);
        ints.size();
        ints.get(-15);
    }

}
