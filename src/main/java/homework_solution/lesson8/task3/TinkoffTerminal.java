package homework_solution.lesson8.task3;

public class TinkoffTerminal extends Terminal {

    private final double MIN_AMOUNT;

    public TinkoffTerminal(String address) {
        super(address);
        owner = Owner.TINKOFF;
        tax = 9;
        noTaxLimit = 600;
        MIN_AMOUNT = 100;
    }

    @Override
    public void pay(String phone, double amount) {
        if (amount >= MIN_AMOUNT)
            super.pay(phone, amount);
        else System.out.printf("Минимальная сумма для пополнения - %.2f. С уважением, ваш %s, %s%n", MIN_AMOUNT, owner.getName(), address);
    }
}
