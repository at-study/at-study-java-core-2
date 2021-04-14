package homework_solution.lesson12.task3.document;

import java.util.Objects;

public class Bank {
    private Integer id;
    private Integer version;
    private String bic;
    private Object place;
    private String name;
    private Object placeType;

    public Bank(Integer id, Integer version, String bic, Object place, String name, Object placeType) {
        this.id = id;
        this.version = version;
        this.bic = bic;
        this.place = place;
        this.name = name;
        this.placeType = placeType;
    }

    public Integer getId() {
        return id;
    }

    public Integer getVersion() {
        return version;
    }

    public String getBic() {
        return bic;
    }

    public Object getPlace() {
        return place;
    }

    public String getName() {
        return name;
    }

    public Object getPlaceType() {
        return placeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bank bank = (Bank) o;

        if (!Objects.equals(id, bank.id)) return false;
        if (!Objects.equals(version, bank.version)) return false;
        if (!Objects.equals(bic, bank.bic)) return false;
        if (!Objects.equals(place, bank.place)) return false;
        if (!Objects.equals(name, bank.name)) return false;
        return Objects.equals(placeType, bank.placeType);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (bic != null ? bic.hashCode() : 0);
        result = 31 * result + (place != null ? place.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (placeType != null ? placeType.hashCode() : 0);
        return result;
    }
}
