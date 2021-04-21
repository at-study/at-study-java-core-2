package lections.lesson2;

public class Fibonacci {

    // 1, 1, 2, 3, 5, 8, 13, 21, 34 ....

    public static void main(String[] args) {
        final int N = 9;
        int result = getFibonacciElement(N);
        System.out.println(result);
    }

    static int getFibonacciElement(final int N) {
        int[] fibonacciArray = new int[2000];
        fibonacciArray[1] = 1;
        fibonacciArray[2] = 1;
        for (int i = 3; i < 2000; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            if (i == N) {
                break;
            }
        }
        return fibonacciArray[N];
    }

}
