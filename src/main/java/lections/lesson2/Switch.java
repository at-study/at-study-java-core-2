package lections.lesson2;

public class Switch {

    public static void main(String[] args) {
        trafficLight("Красный");
        trafficLight("Желтый");
        trafficLight("Зеленый");
        trafficLight("Синий");
        System.out.println();
        System.out.println(getTrafficLightResult("Красный"));
        System.out.println(getTrafficLightResult("Желтый"));
        System.out.println(getTrafficLightResult("Зеленый"));
        System.out.println(getTrafficLightResult("Синий"));
    }

    // В switch в качестве условия можно использовать примитивы, строки, перечисления (enum);

    static void trafficLight(String color) {
        switch (color) {
            case "Красный":
            case "Желтый":
                System.out.println("Ехать нельзя");
                break;
            case "Зеленый":
                System.out.println("Ехать можно");
                break;
            default:
                System.out.println("Неизвестный цвет");
        }
    }

    static String getTrafficLightResult(String color) {
        switch (color) {
            case "Красный":
            case "Желтый":
                return "Ехать нельзя";
            case "Зеленый":
                return "Ехать можно";
            default:
                return "Неизвестный цвет";
        }
    }

    static String getNumberIsEvenResult(int number) {
        return (number % 2 == 0)
                ? "Число четное"
                : "Число нечетное";
    }
}
