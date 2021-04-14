package homework_solution.lesson4.task4;

public class Application {

    public static void main(String[] args) {
        Passport passport = new Passport().setSeries("0000").setNumber("000000");
        Passport notUniquePassport = new Passport().setSeries("0000").setNumber("000000");

        Passport incorrectPassport2 = new Passport().setSeries("123").setNumber("12555");
        Passport incorrectPassport3 = new Passport().setSeries("12363").setNumber("1255665");
        Passport incorrectPassport4 = new Passport().setSeries("").setNumber("");

        Passport nullFieldsPassport = new Passport();
        System.out.printf("Паспорт5: %s, %s%n", nullFieldsPassport.getSeries(), nullFieldsPassport.getNumber());

        // Ошибки быть не должно, т.к. частично заполненные паспорта не валидируем
        Passport withoutNumberPassport = new Passport().setSeries("1234");
        Passport withoutSeriesPassport = new Passport().setNumber("123456");
        Passport withoutNumberPassportCopy = new Passport().setSeries("1234");
        Passport withoutSeriesPassportCopy = new Passport().setNumber("123456");

        // Корректное прикрепление паспорта к Human
        Human human = new Human().setLastName("Иванов").setFirstName("Петр").setAge(15).setPassport(passport);

        // Некорректные 3 прикрепления паспорта к Human
        human.setPassport(withoutNumberPassport).setPassport(withoutSeriesPassport).setPassport(nullFieldsPassport);
    }

}
