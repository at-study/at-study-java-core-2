package lections.lesson2;

public class Break {

    public static void main(String[] args) {
        int[] array = {1, 5, 3, -2, 0, 5, 2};
        int sum = 0;
        for (int current : array) {
            if (current < 0) {
                break;
            }
            sum += current;
        }
        System.out.println("Сумма чисел до первого отрицательного элемента равна " + sum);

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] % 3 == 0) {
                    break;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        String[] strings = {"Семь", "Пятниц", "На", "Неделе"};
        boolean isArrayContainsString = false;
        for (String s : strings) {
            if (s.length() == 6) {
                isArrayContainsString = true;
                break;
            }
        }
        System.out.println(isArrayContainsString ? "Есть строка длиной 6" : "Нет строки длиной 6");

        int[] numbers2 = {1, 2, 3, 4, 5, -11, 7, -12, -18, 0};
        int sum2 = 0;
        for (int current : numbers2) {
            if (current < 0) {
                continue;
            }
            sum2 += current;
        }
        System.out.println("Сумма неотрицательных чисел массива равна " + sum2);
    }

}
