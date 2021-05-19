package lections.lesson4.modifiers_another;

import lections.lesson4.modifiers.Modifiers;

public class Application {

    public static void main(String[] args) {
        Modifiers instance = new Modifiers();

        instance.publicVariable = 3;
       // instance.protectedVariable = 3; // Данная переменная не видна
       // instance.defaultVariable = 3; // Данная переменная не видна
       // instance.privateVariable = 3; // Данная переменная не видна
    }


}
