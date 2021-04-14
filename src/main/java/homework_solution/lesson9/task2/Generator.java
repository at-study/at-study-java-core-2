package homework_solution.lesson9.task2;

public class Generator {
    private static int roundRobin = 0;

    public static Object generate() {
        roundRobin %= 4;
        switch (roundRobin++) {
            case 0: return new Square();
            case 1: return new Circle();
            case 2: return new Box();
            case 3: return new Table();
        }
        return null;
    }
}
