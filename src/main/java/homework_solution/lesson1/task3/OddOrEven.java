package homework_solution.lesson1.task3;

public class OddOrEven {

    public static void main(String[] args) {
        OddOrEven odd = new OddOrEven();
        System.out.println(odd.isOdd(14));
        System.out.println(odd.isOdd(19));
    }

    boolean isOdd(int n) {
        return n % 2 == 1;
    }
}
