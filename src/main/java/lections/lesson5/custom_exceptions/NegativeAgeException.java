package lections.lesson5.custom_exceptions;

public class NegativeAgeException extends IllegalAgeException {

    public NegativeAgeException() {
        super("Возраст отрицательный");
    }

}
