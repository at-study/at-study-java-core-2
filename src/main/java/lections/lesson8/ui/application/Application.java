package lections.lesson8.ui.application;

import lections.lesson8.ui.browsers.Browser;
import lections.lesson8.ui.browsers.BrowserFactory;
import lections.lesson8.ui.screenshots.TakesScreenshot;

public class Application {

    public static void main(String[] args) {
        Browser browser = BrowserFactory.getBrowser();
        browser.openPage("https://google.ru");
        ((TakesScreenshot) browser).takeScreenshot();
    }

}
