package lections.lesson10;

public class Sample {

    private static String description;
    private static int count;

    public static void printCount() {
        System.out.println(count);
    }

    public String getDescription(String prefix) {
        return prefix + description;
    }

}
