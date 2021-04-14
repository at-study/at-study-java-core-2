package homework_solution.lesson12.task3.document;

import java.util.Objects;

public class MultiLang {
    private String ru_RU;

    public MultiLang(String ru_RU) {
        this.ru_RU = ru_RU;
    }

    public String getRu_RU() {
        return ru_RU;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MultiLang multiLang = (MultiLang) o;

        return Objects.equals(ru_RU, multiLang.ru_RU);
    }

    @Override
    public int hashCode() {
        return ru_RU != null ? ru_RU.hashCode() : 0;
    }
}
