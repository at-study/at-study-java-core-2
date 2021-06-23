package lections.lesson8.industry.stations;

import lections.lesson8.industry.cars.Fillable;

public interface Filler {

    default void fill(Fillable fillable) {
        fillable.fillFull();
    }

    default void fill(Fillable fillable, int litres) {
        fillable.fill(litres);
    }

}
