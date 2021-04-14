package homework_solution.lesson1.task4;

public class Meters {

    public static void main(String[] args) {
        System.out.println(Meters.getMeters(115));
        System.out.println(Meters.getMeters(800));
        System.out.println(Meters.getMeters(278));
    }

    static int getMeters(int centimeters) {
        return centimeters / 100;
    }
}
