package homework_solution.lesson2.task1;

public class Cycles {

    public static void main(String[] args) {
        String[] strings = {"Пятница", "это", "лучший", "день", "недели"};

        new Cycles().printByFor(strings);
        new Cycles().printByForEach(strings);
        new Cycles().printByWhile(strings);
    }

    void printByFor(String[] array) {
        String result = "";
        for (int index = 0; index < array.length; index++)
            result += array[index] + " ";
        result = result.trim() + ".";
        System.out.println(result);
    }

    void printByForEach(String[] array) {
        String result = "";
        for (String element : array)
            result += element + " ";
        result = result.trim() + ".";
        System.out.println(result);
    }

    void printByWhile(String[] array) {
        int index = 0;
        String result = "";
        while (index < array.length)
            result += array[index++] + " ";
        result = result.trim() + ".";
        System.out.println(result);
    }

}
