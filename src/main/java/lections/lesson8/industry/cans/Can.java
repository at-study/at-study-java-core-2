package lections.lesson8.industry.cans;

import lections.lesson8.industry.cars.Fillable;
import lections.lesson8.industry.stations.Filler;

public class Can implements Fillable, Filler {

    private int currentFuelLevel = 0;
    private int maxFuelLevel = 20;

    @Override
    public void fillFull() {
        currentFuelLevel = maxFuelLevel;
    }

    @Override
    public void fill(int litres) {
        currentFuelLevel += litres;
        if (currentFuelLevel > maxFuelLevel) {
            currentFuelLevel = maxFuelLevel;
        }
    }

    @Override
    public void fill(Fillable fillable) {
        fillable.fill(currentFuelLevel);
    }

    @Override
    public void fill(Fillable fillable, int litres) {
        fillable.fill(Math.min(litres, currentFuelLevel));
    }
}
