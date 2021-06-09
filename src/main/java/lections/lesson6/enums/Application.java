package lections.lesson6.enums;

public class Application {

    public static void main(String[] args) {
        DayOfWeek monday = DayOfWeek.MONDAY;
        DayOfWeek tuesday = DayOfWeek.TUESDAY;

        boolean isEqual = (monday == tuesday);

        // Возвращает объект enum-a из строки:
        DayOfWeek weekDay = DayOfWeek.valueOf("WEDNESDAY");

        // Все объекты enum:
        DayOfWeek[] allDays = DayOfWeek.values();

        // Индекс объекта в enum:
        int index = tuesday.ordinal();
        String name = tuesday.name();

        //for (DayOfWeek currentDay : allDays) {
        //    System.out.println(currentDay.name());
        //}

        //System.out.println(DayType.getDayType(DayOfWeek.SUNDAY).name());
        //System.out.println(DayType.getDayType(DayOfWeek.WEDNESDAY).name());

        TrafficLightColor green = TrafficLightColor.GREEN;
        TrafficLightColor red = TrafficLightColor.RED;

        System.out.println(green.getDescription());
        System.out.println(red.getDescription());
        System.out.println(TrafficLightColor.UNKNOWN.getDescription());

        TrafficLightColor yellow = TrafficLightColor.of("Желтый");

        String descr = TrafficLightColor.GREEN.getDescription();

    }

}
