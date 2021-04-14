package homework_solution.lesson5.task5;

import homework_solution.lesson5.task5.exceptions.PassportAlreadyExistsException;
import homework_solution.lesson5.task5.exceptions.PassportIllegalArgumentException;
import homework_solution.lesson5.task5.exceptions.PassportNullPointerException;
import homework_solution.lesson5.task5.exceptions.PassportNumberArgumentException;
import homework_solution.lesson5.task5.exceptions.PassportNumberNullPointerException;
import homework_solution.lesson5.task5.exceptions.PassportSeriesArgumentException;
import homework_solution.lesson5.task5.exceptions.PassportSeriesNullPointerException;

public class Passport {
    private static final Passport[] ALL_PASSPORTS = new Passport[100];
    private static int index = 0;

    private String series;
    private String number;

    public Passport(String series, String number) throws PassportIllegalArgumentException, PassportNullPointerException, PassportAlreadyExistsException {
        if (series == null) throw new PassportSeriesNullPointerException();
        if (number == null) throw new PassportNumberNullPointerException();
        if (!series.matches("^(\\d{2})-(\\d{2})$"))
            throw new PassportSeriesArgumentException();
        if (!number.matches("^(\\d{6})$"))
            throw new PassportNumberArgumentException();
        for (Passport passport : ALL_PASSPORTS) {
            if (passport == null) break;
            if (passport.series.equals(series) && passport.number.equals(number))
                throw new PassportAlreadyExistsException();
        }
        this.series = series;
        this.number = number;
        ALL_PASSPORTS[index++] = this;
        System.out.printf("Паспорт с серией %s и номером %s успешно создан%n", series, number);
    }
}
