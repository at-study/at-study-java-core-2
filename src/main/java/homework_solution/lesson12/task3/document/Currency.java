package homework_solution.lesson12.task3.document;

import java.util.Objects;

public class Currency {
    private Integer id;
    private Integer version;
    private String alphabeticCode;
    private String numericCode;
    private String okvName;

    public Currency(Integer id, Integer version, String alphabeticCode, String numericCode, String okvName) {
        this.id = id;
        this.version = version;
        this.alphabeticCode = alphabeticCode;
        this.numericCode = numericCode;
        this.okvName = okvName;
    }

    public Integer getId() {
        return id;
    }

    public Integer getVersion() {
        return version;
    }

    public String getAlphabeticCode() {
        return alphabeticCode;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public String getOkvName() {
        return okvName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Currency currency = (Currency) o;

        if (!Objects.equals(id, currency.id)) return false;
        if (!Objects.equals(version, currency.version)) return false;
        if (!Objects.equals(alphabeticCode, currency.alphabeticCode)) return false;
        if (!Objects.equals(numericCode, currency.numericCode)) return false;
        return Objects.equals(okvName, currency.okvName);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (alphabeticCode != null ? alphabeticCode.hashCode() : 0);
        result = 31 * result + (numericCode != null ? numericCode.hashCode() : 0);
        result = 31 * result + (okvName != null ? okvName.hashCode() : 0);
        return result;
    }
}
