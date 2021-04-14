package homework_solution.lesson1.task5;

public class Logic {

    public static void main(String[] args) {
        Logic logic = new Logic();

        System.out.println(logic.firstMethod(false, false) + " " + logic.secondMethod(false, false));
        System.out.println(logic.firstMethod(false, true) + " " + logic.secondMethod(false, true));
        System.out.println(logic.firstMethod(true, false) + " " + logic.secondMethod(true, false));
        System.out.println(logic.firstMethod(true, true) + " " + logic.secondMethod(true, true));
    }

    boolean firstMethod(boolean a, boolean b) {
        return !(a || b);
    }

    boolean secondMethod(boolean a, boolean b) {
        return !a && !b;
    }
}
