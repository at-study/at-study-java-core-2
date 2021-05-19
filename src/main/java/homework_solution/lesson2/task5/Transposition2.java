package homework_solution.lesson2.task5;

import java.util.Random;

public class Transposition2 {

    public static void main(String[] args) {
        final int M = new Random().nextInt(3) + 3;
        final int N = new Random().nextInt(3) + 3;
        int[][] sourceMatrix = createArray(M, N);
        int[][] destinationMatrix = transpose(sourceMatrix);
        printArray(sourceMatrix);
        printArray(destinationMatrix);
    }

    /**
     * Создает случайный массив размерностью m x n
     *
     * @param m
     * @param n
     * @return
     */
    private static int[][] createArray(int m, int n) {
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = new Random().nextInt(10);
            }
        }
        return result;
    }

    /**
     * Транспонирует матрицу
     *
     * @param sourceMatrix - исходная матрица
     * @return транспонированная матрица
     */
    private static int[][] transpose(int[][] sourceMatrix) {
        int m = sourceMatrix.length;
        int n = sourceMatrix[0].length;
        int[][] result = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = sourceMatrix[i][j];
            }
        }
        return result;
    }

    /**
     * Выводит матрицу на экран
     *
     * @param matrix
     */
    private static void printArray(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
