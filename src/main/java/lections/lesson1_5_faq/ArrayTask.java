package lections.lesson1_5_faq;

import java.util.Arrays;

/**
 * Имеется исходный массив. Создать новый массив из исходного, включающий только четные элементы.
 */
public class ArrayTask {

    public static void main(String[] args) {
        int[] source = {2, 7, 4, 1, 6, 5, 8, 0};

        int length = getEvenElementsCount(source);
        int[] destination = new int[length];

        int index = 0;
        for (int current : source) {
            if (current % 2 == 0) {
                destination[index] = current;
                index++;
            }
        }

        System.out.println(Arrays.toString(destination));
    }

    private static int getEvenElementsCount(int[] array) {
        int counter = 0;
        for (int current : array) {
            if (current % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

}
