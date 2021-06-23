package lections.lesson8.industry.application;

import lections.lesson8.industry.cans.Can;
import lections.lesson8.industry.cars.Car;
import lections.lesson8.industry.cars.Mercedes;
import lections.lesson8.industry.stations.GasStation;
import lections.lesson8.industry.stations.GasStationImpl;

public class Application {

    public static void main(String[] args) {
        Car mercedes = new Mercedes();
        GasStation gasStation = new GasStationImpl();

        Can can = new Can();
        gasStation.fill(can, 12);
        can.fill(mercedes);
    }

}
