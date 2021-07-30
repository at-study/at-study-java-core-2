package lections.lesson12.widget;

public class Pairs {
    private String key1;
    private String key2;
    transient private Integer version;

    public Pairs(String key1, String key2) {
        this.key1 = key1;
        this.key2 = key2;
    }

    public String getKey1() {
        return key1;
    }

    public String getKey2() {
        return key2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Pairs pairs = (Pairs) o;

        if (key1 != null ? !key1.equals(pairs.key1) : pairs.key1 != null) {
            return false;
        }
        return key2 != null ? key2.equals(pairs.key2) : pairs.key2 == null;
    }

    @Override
    public int hashCode() {
        int result = key1 != null ? key1.hashCode() : 0;
        result = 31 * result + (key2 != null ? key2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pairs{" +
                "key1='" + key1 + '\'' +
                ", key2='" + key2 + '\'' +
                '}';
    }
}
