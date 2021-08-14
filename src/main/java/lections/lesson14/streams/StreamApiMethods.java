package lections.lesson14.streams;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiMethods {
    public static void main(String[] args) {
        Stream.of("Семь", "Пятниц", "На", "Неделе", "На")
                .filter(s -> s.length() > 0)                // Фильтрация элементов. Остаются те, которые подходят под предикат
                .distinct()                                 // Оставляет только первые вхождения элементов. Повторы удаляются
                .sorted()                                   // Сортировка по натуральному ордеру
                .sorted(Comparator.comparingInt(String::length)) //Сортировка по компаратору
                .limit(3)                                   // Оставить первые N элементов
                .skip(1)                                    // Отбросить первые N элементов
                .map(s -> s.length())                       // Преобразует один стрим в другой по функции
                .peek(System.out::println)                  // Выполняет операцию консьюмера над каждым элементом
                .collect(Collectors.toMap(
                        i -> i,
                        i -> i * 2
                ));

    }
}
