package homework_solution.lesson2.task5;

import java.util.Random;

public class Transposition {

    public static void main(String[] args) {
        final int m = new Random().nextInt(3) + 3;
        final int n = new Random().nextInt(3) + 3;

        int[][] sourceMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sourceMatrix[i][j] = new Random().nextInt(9);
            }
        }

        int[][] destMatrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                destMatrix[i][j] = sourceMatrix[j][i];
            }
        }

        System.out.println("Исходная матрица");
        for (int[] row : sourceMatrix) {
            for (int element : row)
                System.out.print(element);
            System.out.println();
        }

        System.out.println("Транспонированная матрица");
        for (int[] row : destMatrix) {
            for (int element : row)
                System.out.print(element);
            System.out.println();
        }
    }
}
