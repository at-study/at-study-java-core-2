package lections.lesson5;

import lections.lesson5.custom_exceptions.IllegalAgeException;

public class HumanApplication {

    public static void main(String[] args) {
        Human ivan = new Human();
/*
        ivan.setAge(15);
        try {
            ivan.setAge(-10);
        } catch (NegativeAgeException exception) {
            System.out.println(exception.getMessage());
        } catch (ZeroAgeException exception) {
            System.out.println(exception.getMessage());
        }
*/


        ivan.setAge(15);
       // ivan.setAge(-120);
        ivan.setAge(18);
        Human sergey = null;
        try {
            sergey = new Human("Сергей", 2000);
        } catch (IllegalAgeException exception) {

            // Сообщение из исключения:
            String message = exception.getMessage();

            // Стектрейс из исключения
            StackTraceElement[] stackTrace = exception.getStackTrace();

            // Получение данных из элемента StackTrace
            String className = stackTrace[0].getClassName();
            String methodName = stackTrace[0].getMethodName();
            int lineNumber = stackTrace[0].getLineNumber();
            String fileName = stackTrace[0].getFileName();

            // Получить экземпляр исключения, из-за которого возникло данное исключение (корневого исключения)
            Throwable rootCause = exception.getCause();

            exception.printStackTrace();
            StackTracePrinter.print(exception);

            System.out.println();
        }
        //ivan.setName("Иван");
        System.out.println(ivan.getAge());
    }

}
