package lections.lesson11.json.id;

public class Address {
    private String street;
    private Integer houseNumber;
    private Integer flatNumber;

    public Address(String street, Integer houseNumber, Integer flatNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }

    public String getStreet() {
        return street;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public Integer getFlatNumber() {
        return flatNumber;
    }
}
