package lections.lesson3;

public class NewApplication {

    static String variable = getStaticVariable();

    static {
        System.out.println("Статический блок кода");
    }

    NewApplication() {
        System.out.println("Конструктор");
    }

    static String getStaticVariable() {
        System.out.println("Статический метод");
        return "Строка";
    }

    void print() {
        System.out.println("Метод объекта");
    }


    public static void main(String[] args) {
    }
}
