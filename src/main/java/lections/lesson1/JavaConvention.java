package lections.lesson1;

import java.util.Random;

// Конвенция для классов:
// С большой буквы. Если Несколько слов, то каждое - с большой буквы
public class JavaConvention {

    // Конвенция о наименованиях в Java:
    // С маленькой буквы, если слово одно
    int number;
    // Если слов несколько, то первое с маленькой буквы, все остальные - с большой. Все слова слова пишутся слитно
    // CamelCase
    int greatNumber;
    char myNewChar;

    // Для констант - все названия пишутся заглавными буквами. Если слов несколько, то между ними "_".
    final double PI = 3.14159265;
    final int LESSON_COUNT = 16;

    // Для методов конвенция аналогично конвенции для переменных
    void print(int numberToPrint) {
        System.out.println(numberToPrint);
    }

    void printNumberIfGreaterThan5(int numberToPrint) {
        if (numberToPrint >= 5) {
            System.out.println(numberToPrint);
        }
    }

    int calculateSum(int first, int second) {
        int result = first + second;
        return result;
    }

    int calculateSum(int first, int second, int third) {
        int result = first + second + third;
        return result;
    }

    int generateRandomNumber() {
        return new Random().nextInt();
    }

    // Ctrl + Alt + L - автоматический формат кода
    // Shift + F6 - реформат/переименование
    // Ctrl + D - копирование строки
    // Alt + F8 - evaluate-режим

    // GIT:
    // 1.   VCS -> Enable Version Control Integration
    // 2.   Ctrl + K - Commit
    // 3.   Ctrl + Shift + K - Push (Указать remote - свой репозиторий на github)

    public static void main(String[] args) {
        JavaConvention application = new JavaConvention();
        final int a = 7;
        final int b = 2;
        int c = application.calculateSum(a, b);
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;
        int h = application.calculateSum(a, b, c);
        application.print(c);
        application.print(d);
        application.print(e);
        application.print(f);
        application.print(g);
        System.out.println();
        application.printNumberIfGreaterThan5(3);
        application.printNumberIfGreaterThan5(5);
        application.printNumberIfGreaterThan5(12);
    }

}
