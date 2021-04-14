package homework_solution.lesson11.task1;

public class Calculator {

    public static int calculateAll(int... values) {
        int summ = 0;
        for (int value : values) {
            summ += value;
        }
        return summ;
    }

    public static int multiplyAll(int... values) {
        int result = 1;
        for (int value : values) {
            result *= value;
        }
        return result;
    }

}
