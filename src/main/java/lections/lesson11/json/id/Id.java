package lections.lesson11.json.id;

public class Id {
    private String firstName;
    private Passport passport;
    private Address address;
    private Object registration;

    public Id(String firstName, Passport passport, Address address, Object registration) {
        this.firstName = firstName;
        this.passport = passport;
        this.address = address;
        this.registration = registration;
    }

    public String getFirstName() {
        return firstName;
    }

    public Passport getPassport() {
        return passport;
    }

    public Address getAddress() {
        return address;
    }

    public Object getRegistration() {
        return registration;
    }
}
