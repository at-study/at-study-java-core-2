package lections.lesson4.modifiers;

public class Application {

    public static void main(String[] args) {
        Modifiers instance = new Modifiers();

        instance.publicVariable = 3;
        instance.protectedVariable = 3;
        instance.defaultVariable = 3;
        // instance.privateVariable = 3; Данная переменная не видна

    }

}
