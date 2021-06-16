package lections.lesson7.inheritance.browser;

public class BrowserFactory {

    public static Browser getBrowser() {
        String browserName = System.getProperty("browser");
        switch (browserName) {
            case "opera":
                return new Opera();
            case "firefox":
                return new Firefox();
            case "chrome":
                return new Chrome();
            default:
                throw new IllegalArgumentException("Not supported browser: " + browserName);
        }
    }

}
