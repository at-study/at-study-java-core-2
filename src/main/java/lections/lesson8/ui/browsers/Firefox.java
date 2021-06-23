package lections.lesson8.ui.browsers;

import lections.lesson8.ui.screenshots.TakesScreenshot;

public class Firefox implements Browser, TakesScreenshot {

    Firefox() {

    }

    @Override
    public void openPage(String url) {
        System.out.println("В Firefox открыта страница " + url);
    }

    @Override
    public void takeScreenshot() {
        System.out.println("В Firefox сделан скриншот");
    }
}