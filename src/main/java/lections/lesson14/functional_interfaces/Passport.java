package lections.lesson14.functional_interfaces;

public class Passport implements Comparable<Passport> {

    private String series;
    private String number;

    public Passport() {
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Passport passport = (Passport) o;

        if (series != null ? !series.equals(passport.series) : passport.series != null) {
            return false;
        }
        return number != null ? number.equals(passport.number) : passport.number == null;
    }

    @Override
    public int hashCode() {
        int result = series != null ? series.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Passport o) {
        if (!series.equals(o.series)) {
            return series.compareTo(o.series);
        }
        if (!number.equals(o.number)) {
            return number.compareTo(o.number);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "series='" + series + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
