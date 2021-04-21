package lections.lesson2;

public class Cycles {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int[] numbers = {6, 4, 7, 21, 0, 6, 3, 4, 8, 5, 11, 12, 14};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.printf("Сумма элементов массива равна %d%n", sum);
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            if (current % 2 == 0) {
                System.out.print(current + " ");
            }
        }

        System.out.println();

        sum = 0;
        int index = 0;
        for (int current : numbers) {
            sum += current;
            index++;
        }
        System.out.printf("Сумма элементов массива равна %d%n", sum);


        sum = 0;
        index = 0;
        while (index < numbers.length) {
            sum += numbers[index++];
        }
        System.out.printf("Сумма элементов массива равна %d%n", sum);
    }

}
