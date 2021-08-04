package lections.lesson13.calculator;

public class CalculatorApplication {

    public static void main(String[] args) {
        NumberOperation sum = Integer::sum;
        NumberOperation multiplier = (a, b) -> a * b;
        NumberOperation pow = (a, b) -> (int) Math.pow(a, b);
        NumberOperation min = (a, b) -> Math.min(a, b);
        NumberOperation min1 = Math::min;

        int sumResult = sum.process(5, 3);
        int multiplyResult = multiplier.process(5, 3);
        int powResult = pow.process(3, 4);

        System.out.println(sumResult);
        System.out.println(multiplyResult);
        System.out.println(powResult);

        System.out.println(min.process(8, 5));
    }

}
