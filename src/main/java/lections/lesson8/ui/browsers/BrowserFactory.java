package lections.lesson8.ui.browsers;

import java.util.Objects;

public class BrowserFactory {

    public static Browser getBrowser() {
        String browserName = System.getProperty("browser");
        Objects.requireNonNull(browserName, "Need to set browser into system variable");
        switch (browserName) {
            case "chrome":
                return new Chrome();
            case "firefox":
                return new Firefox();
            case "opera":
                return new Opera();
            default:
                throw new IllegalArgumentException("Unknown browser: " + browserName);
        }
    }

}
