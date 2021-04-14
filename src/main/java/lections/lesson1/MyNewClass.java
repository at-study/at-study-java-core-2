package lections.lesson1;

public class MyNewClass {

    int a = 1;

    int a() {
        return 1;
    }

    static class InnerClass {

        int innerA = 5;

        int innerMethod(int x) {
            return x * 2;
        }

    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int multiplyResult = calculator.multiply(3, 5);
        double divideResult = calculator.divide(7, 12);
        boolean isNineOdd = calculator.isOdd(9);

        System.out.println(multiplyResult);
        System.out.println(divideResult);
        System.out.println(isNineOdd);

        Rectangle rectangle = new Rectangle();
        rectangle.height = 5;
        rectangle.width = 5;
        System.out.println(rectangle.getSquare());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.isSquare());
    }

}
