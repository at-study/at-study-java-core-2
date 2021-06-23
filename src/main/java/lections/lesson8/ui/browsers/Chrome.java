package lections.lesson8.ui.browsers;

import lections.lesson8.ui.screenshots.TakesScreenshot;

public class Chrome implements Browser, TakesScreenshot {

    Chrome() {
    }

    @Override
    public void openPage(String url) {
        System.out.println("В Chrome открыта страница " + url);
    }

    @Override
    public void takeScreenshot() {
        System.out.println("В Chrome сделан скриншот");
    }
}
