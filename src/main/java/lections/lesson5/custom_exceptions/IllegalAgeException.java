package lections.lesson5.custom_exceptions;

public class IllegalAgeException extends IllegalArgumentException {

    public IllegalAgeException(String message) {
        super(message);
    }

}
