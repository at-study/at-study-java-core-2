package homework_solution.lesson12.task3.document;

import java.util.Objects;

public class Cash {
    private Integer id;
    private Integer version;
    private Object currencyNumericCodeIso;
    private Double nominal;
    private String description;
    private Boolean isCoin;

    public Cash(Integer id, Integer version, Object currencyNumericCodeIso, Double nominal, String description, Boolean isCoin) {
        this.id = id;
        this.version = version;
        this.currencyNumericCodeIso = currencyNumericCodeIso;
        this.nominal = nominal;
        this.description = description;
        this.isCoin = isCoin;
    }

    public Integer getId() {
        return id;
    }

    public Integer getVersion() {
        return version;
    }

    public Object getCurrencyNumericCodeIso() {
        return currencyNumericCodeIso;
    }

    public Double getNominal() {
        return nominal;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getCoin() {
        return isCoin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cash cash = (Cash) o;

        if (!Objects.equals(id, cash.id)) return false;
        if (!Objects.equals(version, cash.version)) return false;
        if (!Objects.equals(currencyNumericCodeIso, cash.currencyNumericCodeIso))
            return false;
        if (!Objects.equals(nominal, cash.nominal)) return false;
        if (!Objects.equals(description, cash.description)) return false;
        return Objects.equals(isCoin, cash.isCoin);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (currencyNumericCodeIso != null ? currencyNumericCodeIso.hashCode() : 0);
        result = 31 * result + (nominal != null ? nominal.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (isCoin != null ? isCoin.hashCode() : 0);
        return result;
    }
}
