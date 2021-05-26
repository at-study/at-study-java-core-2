package lections.lesson5.exceptions.checked_exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDateApplication {

    public static void main(String[] args) {
        Date date = parseDate("25-05.2021");
        System.out.println(date);
    }


    public static Date parseDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        try {
            return sdf.parse(date);
        } catch (ParseException exception) {
            System.out.println("Дата " + date + " в неверном формате");
            return null;
        } finally {
            System.out.println("Преобразование даты завершено");
        }
    }

}
