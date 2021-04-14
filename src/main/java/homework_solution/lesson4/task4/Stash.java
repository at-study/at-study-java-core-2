package homework_solution.lesson4.task4;

public class Stash {
    private static final Passport[] ALL_PASSPORTS = new Passport[100];
    private static int index = 0;

    public static boolean isPassportExists(String series, String number) {
        for (Passport passport : ALL_PASSPORTS) {
            if (passport == null)
                break;
            String currentSeries = passport.getSeries();
            String currentNumber = passport.getNumber();
            if (currentSeries == null || currentNumber == null)
                continue;
            if (currentSeries.equals(series) && currentNumber.equals(number)) {
                System.out.printf("Ошибка: Паспорт с серией %s и номером %s уже существует%n", series, number);
                return true;
            }
        }
        return false;
    }

    public static void addPassport(Passport passport) {
        ALL_PASSPORTS[index++] = passport;
    }
}
