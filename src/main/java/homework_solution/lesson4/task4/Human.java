package homework_solution.lesson4.task4;

public class Human {
    private String lastName;
    private String firstName;
    private int age;
    private Passport passport;

    public Human setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Human setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Human setAge(int age) {
        this.age = age;
        return this;
    }

    public Human setPassport(Passport passport) {
        if (passport == null) {
            System.out.println("Ошибка: Не удалось прикрепить паспорт = null");
            return this;
        }
        if (passport.getNumber() != null && passport.getSeries() != null) {
            System.out.printf("Прикреплен паспорт с серией %s и номером %s к человеку %s %s%n", passport.getSeries(), passport.getNumber(), lastName, firstName);
            this.passport = passport;
        } else
            System.out.printf("Ошибка: Не удалось прикрепить паспорт с серией %s и номером %s%n", passport.getSeries(), passport.getNumber());
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public Passport getPassport() {
        return passport;
    }
}
