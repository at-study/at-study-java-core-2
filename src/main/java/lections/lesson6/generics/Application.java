package lections.lesson6.generics;


import lections.lesson4.humans.Human;

public class Application {

    public static void main(String[] args) {
        IntContainer int1 = new IntContainer(5);
        System.out.println(int1.getValue());

        Container<String> str1 = new Container<>("строка");
        Container<Integer> int2 = new Container<>(15);
        Container<Human> human = new Container<>(new Human());

        // Immutable-классы.

        Boolean bool1;
        Integer int11 = 15;
        Byte byte1 = 10;
        Character char1 = 'c';
        Float float1 = 1.25f;
        Double double1 = 1.15d;
        Long long1 = 3L;
        Short short1 = 15;

        Integer a = 130;
        Integer b = a;
        a = 140;
        System.out.println(b);

        System.out.println(a.equals(b));


    }
}
