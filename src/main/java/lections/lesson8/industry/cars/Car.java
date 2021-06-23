package lections.lesson8.industry.cars;

public abstract class Car implements Fillable {

    protected int currentFuelInLitres;
    protected int maxFuelInLitres;

    public Car(int currentFuelInLitres, int maxFuelInLitres) {
        this.currentFuelInLitres = currentFuelInLitres;
        this.maxFuelInLitres = maxFuelInLitres;
    }

    @Override
    public void fillFull() {
        currentFuelInLitres = maxFuelInLitres;
        System.out.println("Автомобиль заправлен полностью");
    }

    @Override
    public void fill(int litres) {
        currentFuelInLitres += litres;
        if (currentFuelInLitres >= maxFuelInLitres) {
            fillFull();
        } else {
            System.out.println("В автомобиль заправлено " + litres + " литров топлива. Текущее количество: " + currentFuelInLitres);
        }
    }
}
