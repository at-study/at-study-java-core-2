package lections.lesson5.custom_exceptions;

public class TooHighAgeException extends IllegalAgeException {

    public TooHighAgeException() {
        super("Возраст слишком большой");
    }

}
