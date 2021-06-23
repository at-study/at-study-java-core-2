package lections.lesson8.ui.browsers;

import lections.lesson8.ui.screenshots.TakesScreenshot;

public class Opera implements Browser, TakesScreenshot {

    Opera() {

    }

    @Override
    public void openPage(String url) {
        System.out.println("В Opera открыта страница " + url);
    }

    @Override
    public void takeScreenshot() {
        System.out.println("В Opera сделан скриншот");
    }
}
