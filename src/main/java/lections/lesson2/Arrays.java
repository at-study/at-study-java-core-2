package lections.lesson2;

import lections.lesson1.Human;

public class Arrays {

    public static void main(String[] args) {
        // Одномерные массивы:
        int[] array;
        int[] array2 = new int[5];
        int[] array3 = {1, 2, 3, 4};

        array3[1] = 4;
        array3[3] = array3[2];

        System.out.println(array3);

        // Двумерные массивы
        int[][] twoDimensionalArray = new int[3][4];
        int[][] twoDimensionalInitializedArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        System.out.println(twoDimensionalInitializedArray[1][2]);

        Human[] humans = new Human[3];

        System.out.println(array2[3]);
        System.out.println(humans[1]);


        final int[] finalArray = {1, 2, 3};
        // Можно менять значения внутри массива, т.к. ссылка не меняется.
        finalArray[1] = 5;
       // finalArray[-5] = 4; // ArrayIndexOutOfBoundsException

        int result1 = calculateSum(1, 2, 3);
        int result2 = calculateSum(1, 2, 3, 4, 5);
        int result3 = calculateSum();
        int result4 = calculateSum(array3);
    }

    // Vararg - переменное количество параметров
    static int calculateSum(int... numbers) {
        int sum = 0;
        for (int current : numbers) {
            sum += current;
        }
        return sum;
    }

}
