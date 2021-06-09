package lections.lesson6.enums;

public enum DayType {
    WORKING,
    DAY_OFF;

    public static DayType getDayType(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                return WORKING;
            case SATURDAY:
            case SUNDAY:
                return DAY_OFF;
        }
        throw new IllegalArgumentException("Unknown day of week: " + dayOfWeek);
    }

}
