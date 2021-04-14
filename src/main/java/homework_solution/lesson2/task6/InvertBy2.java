package homework_solution.lesson2.task6;

import java.util.Random;

public class InvertBy2 {

    public static void main(String[] args) {
        final int m = new Random().nextInt(9) + 3;
        final int n = new Random().nextInt(9) + 3;

        int[][] sourceMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sourceMatrix[i][j] = new Random().nextInt(2);
            }
        }

        // Получаем случайный индекс для элемента 2, чтобы он был не на краю матрицы
        final int x = 1 + new Random().nextInt(m - 2);
        final int y = 1 + new Random().nextInt(n - 2);
        sourceMatrix[x][y] = 2;

        // Переменная для инвертирования. Как только дойдем до элемента 2, поменяем на значение 1.
        int inverse = 0;
        boolean was2 = false;
        int[][] destMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (sourceMatrix[i][j] == 2) {
                    destMatrix[i][j] = 2;
                    inverse = 1;
                    was2 = true;
                    continue;
                } else
                    destMatrix[i][j] = was2
                            ? (sourceMatrix[i][j] + 1) % 2
                            : sourceMatrix[i][j];
                //destMatrix[i][j] = (sourceMatrix[i][j] + inverse) % 2;

                // Элементы исходной матрицы: 0 или 1
                // До двойки: 0 или 1
                // После двойки 1 или 0
            }
        }

        System.out.println("Исходная матрица");
        for (int[] row : sourceMatrix) {
            for (int element : row)
                System.out.print(element);
            System.out.println();
        }

        System.out.println("Полученная матрица");
        for (int[] row : destMatrix) {
            for (int element : row)
                System.out.print(element);
            System.out.println();
        }
    }

}
