package homework_solution.lesson4.task1;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    private String lastName;
    private String firstName;
    private Date birthDate;

    private final String LAST_NAME = "фамилии";
    private final String FIRST_NAME = "имени";
    private final String BIRTH_DATE = "даты рождения";
    private final String CYRILLIC_REGEX = "^[А-Я][а-я]{2,}$";
    private final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");

    public String getLastName() {
        getPrint(LAST_NAME, lastName);
        return lastName;
    }

    public String getFirstName() {
        getPrint(FIRST_NAME, firstName);
        return firstName;
    }

    public Date getBirthDate() {
        String date = birthDate != null
                ? DATE_FORMAT.format(birthDate)
                : null;
        getPrint(BIRTH_DATE, date);
        return birthDate;
    }

    public void setLastName(String lastName) {
        if (lastName.matches(CYRILLIC_REGEX)) {
            this.lastName = lastName;
            setCorrectPrint(LAST_NAME, lastName);
        } else {
            setIncorrectPrint(lastName);
        }
    }

    public void setFirstName(String firstName) {
        if (firstName.matches(CYRILLIC_REGEX)) {
            this.firstName = firstName;
            setCorrectPrint(FIRST_NAME, firstName);
        } else {
            setIncorrectPrint(firstName);
        }
    }

    public void setBirthDate(Date birthDate) {
        Date today = new Date();
        if (birthDate.before(today)) {
            this.birthDate = birthDate;
            setCorrectPrint(BIRTH_DATE, DATE_FORMAT.format(birthDate));
        } else {
            setIncorrectPrint(DATE_FORMAT.format(birthDate));
        }
    }

    private void getPrint(String type, String value) {
        System.out.printf("Получено значение %s: %s%n", type, value);
    }

    private void setCorrectPrint(String type, String value) {
        System.out.printf("Установлено корректное значение %s: %s%n", type, value);
    }

    private void setIncorrectPrint(String value) {
        System.out.printf("Введенное значение некорректно: %s%n", value);
    }
}
