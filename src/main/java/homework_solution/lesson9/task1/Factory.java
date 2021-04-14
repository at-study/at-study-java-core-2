package homework_solution.lesson9.task1;

import java.util.Random;

import homework_solution.lesson9.task1.cars.Car;
import homework_solution.lesson9.task1.cars.Mercedes;
import homework_solution.lesson9.task1.cars.Mitsubishi;
import homework_solution.lesson9.task1.cars.Nissan;
import homework_solution.lesson9.task1.cars.Renault;

public class Factory {

    public static Car make() {
        int random = new Random().nextInt(101);
        if (random >= 0 && random < 40)
            return new Renault();
        else if (random >= 40 && random < 70)
            return new Nissan();
        else if (random >= 70 && random < 90)
            return new Mitsubishi();
        else if (random >= 90)
            return new Mercedes();
        throw new IllegalStateException();
    }

}
