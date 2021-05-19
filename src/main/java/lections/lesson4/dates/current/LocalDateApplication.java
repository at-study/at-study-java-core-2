package lections.lesson4.dates.current;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateApplication {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // Текущая дата

        // DateTimeFormatter - класс для работы с датами/строками
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate presetDate = LocalDate.parse("2021-12-01", dtf);
        String formattedString = presetDate.format(dtf);

        LocalDate afterDate = LocalDate.parse("2021-12-05", dtf);
        boolean a = afterDate.isAfter(presetDate);

        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime dayBefore = dateTime.minusDays(1);
        LocalDateTime hourBefore = dateTime.minusHours(1);
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_DATE_TIME;

        LocalDateTime parsed = LocalDateTime.parse("2011-12-03T10:15:30+01:00", dtf2);
        System.out.println(parsed);

        long count = getSecondsAmountBetweenTwoDates("07.11.2021", "08.11.2021");
        System.out.println(count);
    }

    public static long getSecondsAmountBetweenTwoDates(String dateBefore, String dateAfter) {
        final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime before = LocalDate.parse(dateBefore, FORMATTER).atStartOfDay();
        LocalDateTime after = LocalDate.parse(dateAfter, FORMATTER).atStartOfDay();
        return ChronoUnit.SECONDS.between(before, after);
    }

}
