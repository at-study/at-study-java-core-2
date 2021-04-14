package homework_solution.lesson12.task3.document;

import java.util.Objects;

public class CashQuantity {
    private Integer quantity;
    private Cash cash;

    public CashQuantity(Integer quantity, Cash cash) {
        this.quantity = quantity;
        this.cash = cash;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Cash getCash() {
        return cash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CashQuantity that = (CashQuantity) o;

        if (!Objects.equals(quantity, that.quantity)) return false;
        return Objects.equals(cash, that.cash);
    }

    @Override
    public int hashCode() {
        int result = quantity != null ? quantity.hashCode() : 0;
        result = 31 * result + (cash != null ? cash.hashCode() : 0);
        return result;
    }
}
