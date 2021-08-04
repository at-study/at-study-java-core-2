package lections.lesson13.generator;

import java.util.Random;

import lections.lesson13.flyable.Bird;
import lections.lesson8.ui.browsers.Browser;
import lections.lesson8.ui.browsers.BrowserFactory;

public class GeneratorApplication {

    public static void main(String[] args) {
        Generator<Integer> randomNumberGen = () -> new Random().nextInt(100);
        Generator<Bird> birdGen = Bird::new;
        Generator<Browser> browserGenerator = BrowserFactory::getBrowser;
        Generator<Browser> browserWithOpenPageGenerator = () -> {
            Browser browser = BrowserFactory.getBrowser();
            browser.openPage("https://google.com");
            return browser;
        };


        System.out.println(randomNumberGen.generate());

        birdGen.generate().flyUp();

        browserWithOpenPageGenerator.generate();

        final int[] generatedBirds = {0};
        Generator<Bird> birdGeneratorWithCounter = () -> {
            generatedBirds[0]++;
            return new Bird();
        };


    }

}
