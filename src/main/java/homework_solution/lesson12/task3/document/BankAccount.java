package homework_solution.lesson12.task3.document;

import java.util.Objects;

public class BankAccount {
    private Account account;
    private Bank bank;

    public BankAccount(Account account, Bank bank) {
        this.account = account;
        this.bank = bank;
    }

    public Account getAccount() {
        return account;
    }

    public Bank getBank() {
        return bank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankAccount that = (BankAccount) o;

        if (!Objects.equals(account, that.account)) return false;
        return Objects.equals(bank, that.bank);
    }

    @Override
    public int hashCode() {
        int result = account != null ? account.hashCode() : 0;
        result = 31 * result + (bank != null ? bank.hashCode() : 0);
        return result;
    }
}
