package lections.lesson7.encapsulation;

import lections.lesson7.inheritance.browser.Browser;
import lections.lesson7.inheritance.browser.BrowserFactory;

public class Application {

    public static void main(String[] args) {
        Browser browser = BrowserFactory.getBrowser();
        browser.open();
    }

}
