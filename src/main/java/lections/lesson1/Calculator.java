package lections.lesson1;

/**
 * Класс-калькулятор
 */

public class Calculator {


    // Однострочный комментарий

    /*
        Многострочный
        комментарий
     */

    /**
     * Вычисление суммы двух чисел
     *
     * @param first  - первое число
     * @param second - второе число
     * @return сумму чисел first и second
     */
    int sum(int first, int second) {
        return first + second;
    }

    /**
     * Вычисление разности двух чисел
     *
     * @param first  - уменьшаемое
     * @param second - вычитаемое
     * @return - разность.
     */
    int substract(int first, int second) {
        return first - second;
    }

    /**
     * Вычисление произведения двух чисел
     *
     * @param first  - множимое
     * @param second - множитель
     * @return произведение
     */

    int multiply(int first, int second) {
        return first * second;
    }

    /**
     * Вычисление частного двух чисел
     *
     * @param first  - делимое
     * @param second - делитель
     * @return частное
     */
    double divide(int first, int second) {
        return 1.0 * first / second;
    }

    /**
     * Является ли число нечетным
     *
     * @param number - проверяемое число
     * @return - результат
     */
    boolean isOdd(int number) {
        return number % 2 == 1;
    }

}
