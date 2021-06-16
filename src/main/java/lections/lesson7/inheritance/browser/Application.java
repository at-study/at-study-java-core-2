package lections.lesson7.inheritance.browser;

public class Application {

    public static void main(String[] args) {
    //  //  Browser browser = BrowserFactory.getBrowser("opera");
    //    browser.open();
//
    // //   browser = BrowserFactory.getBrowser("chrome");
    //    browser.open();
//
    //    browser = BrowserFactory.getBrowser("firefox");
    //    browser.open();
//
      //  browser = BrowserFactory.getBrowser("nsjadfgansdj");
      //  browser.open();

        Browser browser1 = new Chrome();
        ((Chrome) browser1).open();

    }

}
