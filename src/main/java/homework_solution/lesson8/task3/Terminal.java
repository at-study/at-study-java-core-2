package homework_solution.lesson8.task3;

public abstract class Terminal implements TopUpBalance {
    protected String address;
    protected Owner owner;
    protected double tax;
    protected double noTaxLimit;

    @Override
    public void pay(String phone, double amount) {
        double payment = amount >= noTaxLimit
                ? amount
                : amount * (1d - tax / 100);
        System.out.printf("Внесена сумма %.2f для пополнения телефона %s. Баланс пополнен на сумму %.2f. С уважением, ваш %s, %s%n",
                amount, phone, payment, owner.getName(), address);
    }

    public Terminal(String address) {
        this.address = address;
    }

}
