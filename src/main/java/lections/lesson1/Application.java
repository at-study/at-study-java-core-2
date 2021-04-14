package lections.lesson1;

public class Application {

    int number1;
    long longNumber1;

    double a;
    double b;

    char ch;
    boolean isSomething;

    public static void main(String[] args) {
        Application application = new Application();
        application.number1 = 2147483647;
        application.longNumber1 = 2147483648L;
        application.number1 = 2_147_483_647;

        application.a = 1.23;

        double x = 5;
        int y = 2;

        application.b = x / y;

        application.ch = 15;
        application.ch = 'x';

        application.isSomething = true;
        application.isSomething = false;

        System.out.println(application.b);
    }

}
