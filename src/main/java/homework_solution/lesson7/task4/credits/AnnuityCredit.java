package homework_solution.lesson7.task4.credits;

import java.util.ArrayList;
import java.util.List;

public class AnnuityCredit extends BaseCredit {

    public AnnuityCredit(double amount, double rate, int duration) {
        super(amount, rate, duration);
    }

    @Override
    public List<Double> getMonthPayments() {
        double monthRate = rate / 100 / 12;
        List<Double> graph = new ArrayList<>();
        double payment = amount * monthRate * Math.pow(1 + monthRate, duration) / (Math.pow(1 + monthRate, duration) - 1);
        for (int i = 0; i < duration; i++) {
            graph.add(payment);
        }
        return graph;
    }

}
