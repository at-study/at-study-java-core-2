package lections.lesson5.custom_exceptions;

public class ZeroAgeException extends IllegalAgeException {

    public ZeroAgeException() {
        super("Возраст равен нулю");
    }

}
