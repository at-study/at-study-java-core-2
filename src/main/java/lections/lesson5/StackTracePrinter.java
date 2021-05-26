package lections.lesson5;

public class StackTracePrinter {

    public static void print(Throwable exception) {
        System.out.println(exception.getClass().getName() + ": " + exception.getMessage());
        StackTraceElement[] stackTrace = exception.getStackTrace();
        for (StackTraceElement element : stackTrace) {
            System.out.printf(
                    "    at %s.%s(%s:%d)%n",
                    element.getClassName(), element.getMethodName(), element.getFileName(), element.getLineNumber()
            );
        }
    }

}
