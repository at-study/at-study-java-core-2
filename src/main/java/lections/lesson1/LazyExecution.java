package lections.lesson1;

public class LazyExecution {

    /*
     * Таблица истинности логических вычислений:
     *
     *   a      b      И      ИЛИ
     *  true   true   true    true
     *  true   false  false   true
     *  false  true   false   true
     *  false  false  false   false
     */

    public static void main(String[] args) {
        boolean a = true;
        boolean b = !a;

        boolean c = true;
        boolean d = true;

        boolean or = c || d;
        boolean and = c && d;

        LazyExecution instance = new LazyExecution();
        boolean result = instance.a() || instance.b();
        System.out.println(result);

        int x = (instance.a())
                ? 5
                : 3;
        System.out.println(x);
    }


    boolean a() {
        System.out.println("A");
        return true;
    }

    boolean b() {
        System.out.println("B");
        return true;
    }

}
