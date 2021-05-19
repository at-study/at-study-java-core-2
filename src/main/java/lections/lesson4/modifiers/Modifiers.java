package lections.lesson4.modifiers;

public class Modifiers {

    // Виден только внутри класса, где объявлен
    private int privateVariable = 1;
    // Виден везде
    public int publicVariable = 2;
    // Виден в пределах пакета + виден у наследников данного класса
    protected int protectedVariable = 3;
    // Виден в пределах пакета
    int defaultVariable = 4;

    public void someMethod() {
        privateVariable = 2;
        publicVariable = 3;
        protectedVariable = 1;
        defaultVariable = 0;
    }

}
