package lections.lesson4.dates.old;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateApplication {

    public static void main(String[] args) throws ParseException {
        Date date = new Date(); // Конструктор без параметров = текущая дата (текущий момент времени)
        long d = 900_000_000_000L;
        Date presetDate = new Date(d); // 01.01.1970г. + количество миллисекунд, которое указано в параметре

        // SimpleDateFormat - класс для работы с датами/строками
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date parsedDate = sdf.parse("07.07.2021"); // Преобразование (парсинг) строки в дату;
        String formattedString = sdf.format(new Date()); // Преобразование (формат) даты в строку;

        long parsedDataMs = parsedDate.getTime(); // Получение количества мс, прошедших с 01.01.1970 до данной даты

        System.out.println(parsedDataMs);

        Human human = new Human("Иванов", "Михаил", parsedDate);

        System.out.printf("%s %s %s%n", human.getLastName(), human.getFirstName(), human.getBirthDate());

        int length = 1_000_000;
        Human[] humans = new Human[length];
        long before = new Date().getTime();
        for (int i = 0; i < length; i++) {
            humans[i] = new Human("", "", null);
        }
        long after = new Date().getTime();
        System.out.printf("Time taken: %d ms%n", after - before);

        long count = getSecondsAmountBetweenTwoDates("07.11.2021", "08.11.2021");
        System.out.println(count);
    }

    public static long getSecondsAmountBetweenTwoDates(String dateBefore, String dateAfter) throws ParseException {
        final SimpleDateFormat SDF = new SimpleDateFormat("dd.MM.yyyy");
        Date before = SDF.parse(dateBefore);
        Date after = SDF.parse(dateAfter);
        long b = before.getTime();
        long a = after.getTime();
        return (a - b) / 1000;
    }

}
