package lections.lesson10.properties;

import lections.lesson8.ui.browsers.Browser;
import lections.lesson8.ui.browsers.BrowserFactory;

public class PropertyApplication {

    public static void main(String[] args) {
        String url = Property.getStringProperty("url");
        int port = Property.getIntegerProperty("port");
        String protocol = Property.getStringProperty("protocol");
        boolean isRemote = Property.getBooleanProperty("is_remote");

        String address = String.format("%s://%s:%s/path/to/resource?is_remote=%s", protocol, url, port, isRemote);
        Browser browser = BrowserFactory.getBrowser();
        browser.openPage(address);
    }

}
