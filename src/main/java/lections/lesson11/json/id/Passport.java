package lections.lesson11.json.id;

public class Passport {
    private String seria;
    private String number;

    public Passport(String seria, String number) {
        this.seria = seria;
        this.number = number;
    }

    public String getSeria() {
        return seria;
    }

    public String getNumber() {
        return number;
    }
}
