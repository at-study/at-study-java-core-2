package homework_solution.lesson1.task6;

public class Scheme {

    public static void main(String[] args) {
        Scheme scheme = new Scheme();
        System.out.println(scheme.getSchemeResult(false, false, false, false));
        System.out.println(scheme.getSchemeResult(true, true, true, true));
        System.out.println(scheme.getSchemeResult(false, true, false, true));
        System.out.println(scheme.getSchemeResult(true, false, true, false));
        System.out.println(scheme.getSchemeResult(true, true, false, false));
    }

    boolean getSchemeResult(boolean a, boolean b, boolean c, boolean d) {
        boolean ab = a && b;
        boolean cd = !(c || d);
        return ab && cd;
    }
}
