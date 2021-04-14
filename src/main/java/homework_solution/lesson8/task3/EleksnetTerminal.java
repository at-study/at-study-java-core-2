package homework_solution.lesson8.task3;

public class EleksnetTerminal extends Terminal {

    public EleksnetTerminal(String address) {
        super(address);
        owner = Owner.ELEKSNET;
        tax = 11;
        noTaxLimit = 300;
    }
}
