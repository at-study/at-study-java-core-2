package homework_solution.lesson7.task4.credits;

import java.util.ArrayList;
import java.util.List;

public class BaseCredit {
    protected double amount;
    protected double rate;
    protected int duration;

    public BaseCredit(double amount, double rate, int duration) {
        this.amount = amount;
        this.rate = rate;
        this.duration = duration;
    }

    public List<Double> getMonthPayments() {
        List<Double> graph = new ArrayList<>();
        for (int i = 0; i < duration; i++) {
            graph.add(amount / duration);
        }
        return graph;
    }

    public Double calculateOverpayment() {
        Double amount = 0d;
        for (Double currentPayment : getMonthPayments()) {
            amount += currentPayment;
        }
        return amount - this.amount;
    }
}
