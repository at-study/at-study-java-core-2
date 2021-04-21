package lections.lesson2;

import lections.lesson1.Human;

public class Strings {


    public static void main(String[] args) {

        // Объявление строки:

        String string = "Строка";
        string = "Новая строка";
        String string2 = "Строка2";
        string2 = "Новая строка";
        String string3 = new String("Новая строка");

        String escapedString = " \\Новая \"строка\" \r\n\t";

        int a = 3;
        int b = 4;
        boolean ab = (a == b);

        boolean same = (string == string2);
        // Сравнение строк всегда через equals
        boolean equals = string.equals(string2);

        System.out.println(same);
        System.out.println(equals);

        boolean same2 = string2 == string3;
        System.out.println(same2);


        // Получить символ из строки
        char c = string.charAt(2);
        System.out.println(c);

        // Длина строки
        int length = string.length();
        System.out.println(length);

        // Получить последний символ из строки
        char lastChar = string.charAt(string.length() - 1);
        System.out.println(lastChar);

        // Вхождение подстроки в строку.
        boolean startsWith = string.startsWith("Нова");
        boolean endsWith = string.endsWith("трока");
        boolean contains = string.contains("ая стр");
        String passport = "1452 543432";
        boolean matches = string.matches("^\\d{4} \\d{6}$");
        String someString = "\\";

        // Конкатенация строка
        String s1 = "АБВ";
        String s2 = "ГДЕ";
        String s3 = s1 + s2;
        System.out.println(s3);

        // Выделение подстроки из строки
        String substring = string.substring(3, 8);
        System.out.println(substring);

        String upper = string.toUpperCase();
        String lower = string.toLowerCase();
        System.out.println(upper);
        System.out.println(lower);

        // String.valueOf();

        String boolString = String.valueOf(true);
        String xString = String.valueOf('x');
        String intString = String.valueOf(15);

        // replace

        String replacedString = string.replace("о", "0");
        System.out.println(replacedString);
        String regexReplacedString = string.replaceAll("(о[вк])", "123");
        System.out.println(regexReplacedString);

        Human human = new Human();
        human.lastName = "Иванов";
        human.firstName = "Петр";
        human.patronymic = "Матвеевич";
        human.age = 15;
        // "Иванов Петр Матвеевич - 15"
        System.out.println(human.lastName + " " + human.firstName + " " + human.patronymic + " - " + human.age);
        System.out.println(String.format("%s %s %s - %d", human.lastName, human.firstName, human.patronymic, human.age));
        // %s - строка.
        // %d - целое число.
        // %f - число с плавающей точкой
        // %b - boolean
        // %n - платформонезависимый переход на новую строку
        int radius = 3;
        System.out.print(String.format("Площадь круга с радиусом %d равна %.4f%n", radius, getSquare(radius)));
        System.out.printf("Площадь круга с радиусом %d равна %.4f%n", radius, getSquare(radius));

        System.out.println("    \tстрока   ".trim());

    }

    static double getSquare(int radius) {
        return Math.PI * radius * radius;
    }

}
