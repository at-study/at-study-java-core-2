package lections.lesson7.inheritance.browser;

public class Browser {

    Browser() {

    }

    public void open() {
        System.out.println("Открыт браузер " + this.getClass().getSimpleName());
    }

}
